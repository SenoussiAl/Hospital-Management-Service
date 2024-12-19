package seg3x02.pms.domain.staff.facade

import seg3x02.pms.domain.staff.entities.Staff

interface StaffFacade {
    fun getStaffById(id: String): String?
}
