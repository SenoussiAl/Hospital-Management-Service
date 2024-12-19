package seg3x02.pms.domain.staff.facade.implementation

import seg3x02.pms.domain.staff.entities.Staff
import seg3x02.pms.domain.staff.facade.StaffFacade
import seg3x02.pms.domain.staff.factory.StaffFactory
import seg3x02.pms.domain.staff.repositories.StaffRepository
import seg3x02.pms.application.dtos.queries.StaffRegisterDto
import seg3x02.pms.domain.staff.events.StaffCreatedEvent
import seg3x02.pms.domain.staff.entities.staff.Address
import seg3x02.pms.domain.staff.factory.AddressFactory
import seg3x02.pms.domain.staff.repositories.AddressRepository
import seg3x02.pms.application.services.DomainEventEmitter
import java.util.*

class StaffFacadeImpl(

    // Facade attributes
    private val staffRepository: StaffRepository


) : StaffFacade {
    override fun registerStaff(staff: StaffRegisterDto): String? {

	// Validate account existence
	val accountExist = staffRepository.findById(staff.nas)
        if (accountExist != null) {
            return null
        }

	// Prepare Object attributes
        val staffUserAccount: UserAccount = createUserAccount(staff.account)
        val staffUserRole: UserRole = createUserRole(staff.account.role)
	// Validate values
        if (staffUserAccount === null || staffUserRole == null) {
            return null
        }

	// Initialize attribute values
        var staffEntity = staffFactory.createStaff(staff)
        staffEntity.setUserAccount(staff.account)
        staffEntity.setUserRole(staff.account.role)
        staffEntity = staffRepository.save(staffEntity)
        eventEmitter.emit(StaffCreatedEvent(UUID.randomUUID(), Date(), staffEntity.nas))

	// Return Staff object
        return staffEntity.nas

    }
}
