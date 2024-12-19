package seg3x02.pms.application.usecase

import seg3x02.pms.application.dtos.queries.PatientAdmissionRequestDto

interface AdmitPatient {
    /**
     * Admit a patient to a division (UC3)
     * @param patient PatientAdmissionRequestDto
     * @return Boolean true if patient was admitted, false otherwise
     */
    fun admitPatientToDivision(patient: PatientAdmissionRequestDto) : Boolean
}
