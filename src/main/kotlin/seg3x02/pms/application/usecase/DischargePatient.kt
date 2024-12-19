package seg3x02.pms.application.usecase

import seg3x02.pms.application.dtos.queries.PatientDischargeDto

interface DischargePatient {

    /**
     * Discharge a patient from the system (UC8)
     * @param patient PatientDischargeDto
     * @return Boolean true if patient was discharged, false otherwise
     */
    fun dischargePatient(patient: PatientDischargeDto) : Boolean
}
