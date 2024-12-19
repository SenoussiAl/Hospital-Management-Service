package seg3x02.pms.application.dtos.queries

import seg3x02.pms.domain.user.entities.UserAccount

data class StaffRegisterDto(
        val nas: String,
        val password: String,
        val firstName: String,
        val lastName: String,
        val email: String,
        var account: UserAccount
)
