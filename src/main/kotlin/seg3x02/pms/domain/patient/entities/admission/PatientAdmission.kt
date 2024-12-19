package seg3x02.pms.domain.patient.entities.admission

import seg3x02.pms.domain.division.entities.Division
import seg3x02.pms.domain.patient.entities.patient.Patient
import seg3x02.pms.domain.staff.entities.Staff
import java.util.UUID

class PatientAdmission(
    val id: UUID,
        val roomNumber: Int,
        val bedNumber: Int,
        val optionPrivateInsuranceNumber: String?,
) {
    lateinit var patient: Patient
    lateinit var division: Division
    lateinit var requestingChargedNurse: Staff
    lateinit var acceptingChargedNurse: Staff
}
