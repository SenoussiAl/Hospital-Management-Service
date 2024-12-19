package seg3x02.pms.application.usecase

import seg3x02.pms.application.dtos.queries.PatientAdmissionFormRequestDto
import java.util.*

interface AdmitPatientFromRequestList {
    /**
     * Admit a patient from the request list (UC7)
     * @param patientToAdmit PatientAdmissionFormRequestDto
     * @return UUID? patient admission request id if patient was admitted, null otherwise
     */
    fun admitPatientFromRequestList(patientToAdmit: PatientAdmissionFormRequestDto) : UUID?

}
