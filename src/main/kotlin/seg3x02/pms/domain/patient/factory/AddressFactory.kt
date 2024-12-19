package seg3x02.pms.domain.patient.factory

import seg3x02.pms.application.dtos.queries.AddressRegisterDto
import seg3x02.pms.domain.patient.entities.patient.Address

interface AddressFactory {
    fun createAddress(address: AddressRegisterDto): Address
}
