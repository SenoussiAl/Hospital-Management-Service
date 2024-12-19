package seg3x02.pms.application.dtos.queries

import seg3x02.pms.application.enums.PrescriptionAdministrationMethodEnum
import java.time.LocalDateTime

data class MedicationPrescriptionDto(
    val drugNumber: Long,
    val drugName: String,
    val uniteByDay: Int,
    val numberOfAdministrationPerDay: Int,
    val administrationTimes: List<AdministrationTimeDto>,
    val methodOfAdministration: PrescriptionAdministrationMethodEnum,
    val startDate: LocalDateTime,
    val endDate: LocalDateTime,
)

data class AdministrationTimeDto(
        val timeOfDay: LocalDateTime,
        val unitesAdministered: Int
)
