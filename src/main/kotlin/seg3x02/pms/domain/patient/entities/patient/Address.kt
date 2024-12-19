package seg3x02.pms.domain.patient.entities.patient

import java.util.UUID

class Address(
        val id: UUID,
        val street: String,
        val city: String,
        val country: String,
        val postalCode: String
) {
}
