package seg3x02.pms.domain.patient.entities.admission

import seg3x02.pms.domain.patient.entities.patient.Patient
import seg3x02.pms.domain.staff.entities.Staff
import java.sql.Date
import java.sql.Timestamp
import java.util.UUID

class PatientDischarge(
    val id: UUID,
    val dischargeReason: String,
    val dischargeDate: Date,
    val dischargeTime: Timestamp,
    val dischargeNotes: String?
) {
    lateinit var patient: Patient
    lateinit var dischargeNurse: Staff
}
