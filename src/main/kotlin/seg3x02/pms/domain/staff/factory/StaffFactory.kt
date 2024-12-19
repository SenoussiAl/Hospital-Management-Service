package seg3x02.pms.domain.staff.factory

import seg3x02.pms.application.dtos.queries.StaffRegisterDto
import seg3x02.pms.domain.patient.entities.staff.Staff

interface StaffFactory {
    fun createStaff(staff: StaffRegisterDto): Staff
}
