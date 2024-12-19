package seg3x02.pms.domain.division.entities

import seg3x02.pms.domain.division.enums.RationalOfRequestEnum
import seg3x02.pms.domain.patient.entities.patient.Patient
import seg3x02.pms.domain.staff.entities.Staff
import java.util.UUID

class AdmissionRequest(
    val id: UUID,
    val divisionId: UUID,
    val rationaleForRequest: String,
    val priorityAssessment: RationalOfRequestEnum,
) {
    lateinit var requestingChargedNurse: Staff
    lateinit var patient: Patient
}
