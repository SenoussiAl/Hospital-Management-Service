package seg3x02.pms.domain.patient.factory

import seg3x02.pms.application.dtos.queries.PatientNextOfKinRegisterDto
import seg3x02.pms.domain.patient.entities.patient.PatientNextOfKin

interface PatientNextOfKinFactory {
    fun createPatientNextOfKin(patientNextOfKin: PatientNextOfKinRegisterDto): PatientNextOfKin
}
