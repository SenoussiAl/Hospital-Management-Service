package seg3x02.pms.domain.patient.facade.implementation

import seg3x02.pms.application.dtos.queries.AddressRegisterDto
import seg3x02.pms.application.dtos.queries.PatientNextOfKinRegisterDto
import seg3x02.pms.application.dtos.queries.PatientRegisterDto
import seg3x02.pms.application.dtos.queries.PatientUpdateDto
import seg3x02.pms.application.services.DomainEventEmitter
import seg3x02.pms.domain.patient.entities.patient.Address
import seg3x02.pms.domain.patient.entities.patient.PatientNextOfKin
import seg3x02.pms.domain.patient.events.PatientCreatedEvent
import seg3x02.pms.domain.patient.events.PatientNextOfKinCreatedEvent
import seg3x02.pms.domain.patient.events.PatientUpdatedEvent
import seg3x02.pms.domain.patient.facade.PatientFacade
import seg3x02.pms.domain.patient.factory.AddressFactory
import seg3x02.pms.domain.patient.factory.PatientFactory
import seg3x02.pms.domain.patient.factory.PatientNextOfKinFactory
import seg3x02.pms.domain.patient.repositories.AddressRepository
import seg3x02.pms.domain.patient.repositories.ExternalDoctorRepository
import seg3x02.pms.domain.patient.repositories.PatientNextOfKinRepository
import seg3x02.pms.domain.patient.repositories.PatientRepository
import java.util.*

class PatientFacadeImpl(
    private val patientRepository: PatientRepository,
    private val patientNextOfKinRepository: PatientNextOfKinRepository,
    private val addressRepository: AddressRepository,
    private val externalDoctorRepository: ExternalDoctorRepository,
    private val patientFactory: PatientFactory,
    private val patientNextOfKinFactory: PatientNextOfKinFactory,
    private val addressFactory: AddressFactory,
    private var eventEmitter: DomainEventEmitter,

    ): PatientFacade {
    override fun registerPatient(patient: PatientRegisterDto): String? {
        val accountExist = patientRepository.findById(patient.nas)
        if (accountExist != null) {
            return null
        }
        val patientNextOfKin: PatientNextOfKin = createNextOfKin(patient.nextOfKin)
        val patientAddress: Address = createAddress(patient.address)
        val externalDoctor = externalDoctorRepository.findById(patient.externalDoctorID)

        if (patientNextOfKin === null || patientAddress == null || externalDoctor == null) {
            return null
        }
        var patientEntity = patientFactory.createPatient(patient)
        patientEntity.setPatientAddress(patientAddress)
        patientEntity.setPatientNextOfKin(patientNextOfKin)
        patientEntity.setPatientExternalDoctor(externalDoctor)
        patientEntity = patientRepository.save(patientEntity)
        eventEmitter.emit(PatientCreatedEvent(UUID.randomUUID(), Date(), patientEntity.nas))
        return patientEntity.nas
    }

    override fun updatePatientFile(updatedPatient: PatientUpdateDto, patientNAS: String): Boolean {
        var patient = patientRepository.findById(patientNAS)
        if (patient != null) {
            val updated = patientFactory.createPatient(patient, updatedPatient)
            patient.update(updated)
            if (updatedPatient.address != null) {
                val address = createAddress(updatedPatient.address!!)
                patient.setPatientAddress(address)
            }
            if (updatedPatient.nextOfKin != null) {
                val nextOfKin = createNextOfKin(updatedPatient.nextOfKin!!)
                patient.setPatientNextOfKin(nextOfKin)
            }
            if (updatedPatient.externalDoctorID != null) {
                val externalDoctor = externalDoctorRepository.findById(updatedPatient.externalDoctorID)
                if (externalDoctor != null) {
                    patient.setPatientExternalDoctor(externalDoctor)
                }
            }
            patient = patientRepository.save(patient)
            eventEmitter.emit(PatientUpdatedEvent(UUID.randomUUID(), Date(), patient.nas))
            return true
        }
        return false
    }

    private fun createAddress(address: AddressRegisterDto): Address {
        var patientAddress = addressFactory.createAddress(address)
        patientAddress =  addressRepository.save(patientAddress)
        eventEmitter.emit(PatientNextOfKinCreatedEvent(UUID.randomUUID(), Date(), patientAddress.id))
        return patientAddress
    }

    private fun createNextOfKin(nextOfKin: PatientNextOfKinRegisterDto): PatientNextOfKin {
        var patientNextOfKin = patientNextOfKinFactory.createPatientNextOfKin(nextOfKin)
        patientNextOfKin = patientNextOfKinRepository.save(patientNextOfKin)
        eventEmitter.emit(PatientNextOfKinCreatedEvent(UUID.randomUUID(), Date(), patientNextOfKin.id))
        return patientNextOfKin;
    }
}
