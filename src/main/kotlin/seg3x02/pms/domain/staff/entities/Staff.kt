package seg3x02.pms.domain.staff.entities

import seg3x02.pms.domain.user.entities.UserAccount
import seg3x02.pms.domain.user.entities.UserRole
import java.util.UUID

class Staff(
    val nas: String,
    val password: String,
    val firstName: String,
    val lastName: String,
    val email: String

) {
    lateinit var account: UserAccount;

    fun update(staff: Staff) {
        this.firstName = staff.firstName
        this.lastName = staff.lastName
        this.email = staff.email
    }

    fun setStaffUserAccount(userAccount: UserAccount) {
        this.account = userAccount
    }

    fun setStaffUserRole(userRole: UserRole) {
        this.account.role = userRole
    }
}
