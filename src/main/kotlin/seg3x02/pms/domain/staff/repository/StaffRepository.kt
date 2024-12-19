package seg3x02.pms.domain.staff.repository

import seg3x02.pms.domain.staff.entities.Staff

interface StaffRepository {
    fun getStaffById(id: String): Staff?
    fun save(staff: Staff): Staff
}
