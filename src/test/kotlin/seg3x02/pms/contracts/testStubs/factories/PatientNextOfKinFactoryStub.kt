package seg3x02.pms.contracts.testStubs.factories

import seg3x02.pms.application.dtos.queries.PatientNextOfKinRegisterDto
import seg3x02.pms.domain.patient.entities.patient.PatientNextOfKin
import seg3x02.pms.domain.patient.factory.PatientNextOfKinFactory
import java.util.*

class PatientNextOfKinFactoryStub: PatientNextOfKinFactory {
    override fun createPatientNextOfKin(patientNextOfKin: PatientNextOfKinRegisterDto): PatientNextOfKin {
        val nextOfKin = PatientNextOfKin(
            UUID.randomUUID(),
            patientNextOfKin.firstName,
            patientNextOfKin.lastName,
            patientNextOfKin.phoneNumber)
        return nextOfKin
    }
}
