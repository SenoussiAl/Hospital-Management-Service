package seg3x02.pms.contracts.testStubs.factories

import seg3x02.pms.application.dtos.queries.StaffRegisterDto
import seg3x02.pms.application.dtos.queries.StaffUpdateDto
import seg3x02.pms.domain.staff.entities.Staff
import seg3x02.pms.domain.staff.factory.StaffFactory
import seg3x02.pms.domain.user.entities.UserAccount

class StaffFactoryStub : StaffFactory {
    override fun createStaff(staff: StaffRegisterDto): Staff {
        return Staff(
            staff.nas,
            staff.password,
            staff.firstName,
            staff.lastName,
            patient.email,
            UserAccount.valueOf(staff.account.toString()),
        )
    }

    override fun createStaff(staffEntity: Staff, staff: StaffUpdateDto): Staff {
        var updatedAccount = patient.account
        if (updatedAccount == null) {
            updatedAccount = seg3x02.pms.domain.user.entities.UserAccount.valueOf(staffEntity.account.toString())
        }
        return Staff(
            staffEntity.nas,
            staff.password ?: staffEntity.password,
            staff.firstName ?: staffEntity.firstName,
            staff.lastName ?: staffEntity.lastName,
            staff.email ?: staffEntity.email,
            UserAccount.valueOf(updatedAccount.toString()),
        )
    }

}
