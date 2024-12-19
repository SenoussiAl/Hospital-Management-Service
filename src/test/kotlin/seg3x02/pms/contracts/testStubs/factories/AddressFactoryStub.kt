package seg3x02.pms.contracts.testStubs.factories

import seg3x02.pms.application.dtos.queries.AddressRegisterDto
import seg3x02.pms.domain.patient.entities.patient.Address
import seg3x02.pms.domain.patient.factory.AddressFactory
import java.util.*

class AddressFactoryStub: AddressFactory {
    override fun createAddress(address: AddressRegisterDto): Address {
        return Address(
            UUID.randomUUID(),
            address.street,
            address.city,
            address.country,
            address.postalCode
        )
    }
}
