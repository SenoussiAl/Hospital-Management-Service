package seg3x02.pms.application.usecase

import seg3x02.pms.application.dtos.queries.PatientRegisterDto

interface RegisterPatient {
    /**
     * Register a patient to the system (UC1)
     * @param patient PatientRegisterDto
     * @return String? patient NAS if patient was registered, null otherwise
     */
    fun registerPatient(patient: PatientRegisterDto) : String?
}
