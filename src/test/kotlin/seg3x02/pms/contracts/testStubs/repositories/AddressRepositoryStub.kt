package seg3x02.pms.contracts.testStubs.repositories

import seg3x02.pms.domain.patient.entities.patient.Address
import seg3x02.pms.domain.patient.repositories.AddressRepository
import java.util.*
import kotlin.collections.HashMap

class AddressRepositoryStub: AddressRepository {
    private val addresses: MutableMap<UUID, Address> = HashMap()
    override fun save(address: Address): Address {
        addresses[address.id] = address
        return address
    }

    override fun findById(id: UUID): Address? {
        return addresses[id]
    }
}
