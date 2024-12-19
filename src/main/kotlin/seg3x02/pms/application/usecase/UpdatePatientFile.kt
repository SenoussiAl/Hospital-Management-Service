package seg3x02.pms.application.usecase

import seg3x02.pms.application.dtos.queries.PatientUpdateDto

interface UpdatePatientFile {
    /**
     * Update a patient's file (UC5)
     * @param updatedPatient PatientUpdateDto
     * @return Boolean true if patient file was updated, false otherwise
     */
    fun updatePatientFile(updatedPatient: PatientUpdateDto, patientNAS: String) : Boolean
}
