package seg3x02.pms.domain.prescription.entities

import seg3x02.pms.domain.patient.entities.patient.Patient
import seg3x02.pms.domain.prescription.enums.PrescriptionAdministrationMethodEnum
import seg3x02.pms.domain.staff.entities.Staff
import java.time.LocalDateTime
import java.util.UUID

class MedicationPrescription(
    val id: UUID,
    val drugNumber: Long,
    val drugName: String,
    val uniteByDay: Int,
    val numberOfAdministrationPerDay: Int,
    val administrationTimes: MutableList<UUID> = ArrayList(),
    val methodOfAdministration: PrescriptionAdministrationMethodEnum,
    val startDate: LocalDateTime,
    val endDate: LocalDateTime,
) {
    lateinit var patient: Patient;
    lateinit var doctor: Staff;
}
