package seg3x02.pms.domain.user.entities

class UserAccount(
        val nas: String,
        val password: String,
        val firstName: String,
        val lastName: String,
        val email: String) {
    lateinit var role: UserRole
}
