package seg3x02.pms.contracts.testStubs.factories

import seg3x02.pms.application.dtos.queries.PatientRegisterDto
import seg3x02.pms.application.dtos.queries.PatientUpdateDto
import seg3x02.pms.domain.patient.entities.patient.Patient
import seg3x02.pms.domain.patient.enums.MaritalStatusEnum
import seg3x02.pms.domain.patient.factory.PatientFactory

class PatientFactoryStub : PatientFactory {
    override fun createPatient(patient: PatientRegisterDto): Patient {
        return Patient(
            patient.nas,
            patient.firstName,
            patient.lastName,
            patient.phoneNumber,
            patient.dob,
            patient.gender,
            MaritalStatusEnum.valueOf(patient.maritalStatus.toString()),
        )
    }

    override fun createPatient(patientEntity: Patient, patient: PatientUpdateDto): Patient {
        var updatedMaritalStatus = patient.maritalStatus
        if (updatedMaritalStatus == null) {
            updatedMaritalStatus = seg3x02.pms.application
                .enums.MaritalStatusEnum.valueOf(patientEntity.maritalStatus.toString())
        }
        return Patient(
            patientEntity.nas,
            patient.firstName ?: patientEntity.firstName,
            patient.lastName ?: patientEntity.lastName,
            patient.phoneNumber ?: patientEntity.phoneNumber,
            patient.dob ?: patientEntity.dob,
            patient.gender ?: patientEntity.gender,
            MaritalStatusEnum.valueOf(updatedMaritalStatus.toString()),
        )
    }

}
