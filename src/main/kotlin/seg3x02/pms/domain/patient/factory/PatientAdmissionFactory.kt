package seg3x02.pms.domain.patient.factory

import seg3x02.pms.application.dtos.queries.PatientAdmissionRequestDto
import seg3x02.pms.domain.patient.entities.admission.PatientAdmission

interface PatientAdmissionFactory {
    fun createPatientAdmission(patientAdmissionRequestDto: PatientAdmissionRequestDto): PatientAdmission
}
