package seg3x02.pms.domain.patient.repositories

import seg3x02.pms.domain.patient.entities.patient.Address
import java.util.UUID

interface AddressRepository {
    fun save(address: Address): Address
    fun findById(id: UUID): Address?
}
