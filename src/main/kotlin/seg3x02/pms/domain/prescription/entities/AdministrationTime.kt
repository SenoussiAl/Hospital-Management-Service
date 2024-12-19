package seg3x02.pms.domain.prescription.entities

import java.time.LocalDateTime
import java.util.UUID

class AdministrationTime(
    val administrationTimeID: UUID,
    val timeOfDay: LocalDateTime,
    val unitesAdministered: Int,
) {
}
