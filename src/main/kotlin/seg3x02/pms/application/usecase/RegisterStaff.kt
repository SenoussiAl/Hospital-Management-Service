package seg3x02.pms.application.usecase

import seg3x02.pms.application.dtos.queries.StaffRegisterDto

interface RegisterStaff {

    /**
     * Register a staff member to the system (UC9)
     * @param staff StaffRegisterDto
     * @return String? staff ID if staff was registered, null otherwise
     */
    fun registerStaff(staff: StaffRegisterDto) : String?
}
