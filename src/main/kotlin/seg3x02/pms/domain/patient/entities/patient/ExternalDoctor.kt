package seg3x02.pms.domain.patient.entities.patient

import java.util.UUID

class ExternalDoctor(
    val id: UUID,
    val firstName: String,
    val lastName: String,
    val phoneNumber: String,
    val email: String,
)
