package seg3x02.pms.application.usecase.implementation

import seg3x02.pms.application.dtos.queries.StaffRegisterDto
import seg3x02.pms.application.usecase.RegisterStaff
import seg3x02.pms.domain.staff.facade.StaffFacade

class RegisterPatientImpl(
    private var staffFacade: StaffFacade,
): RegisterStaff {

    override fun registerStaff(staff: StaffRegisterDto): String? {
        return staffFacade.registerStaff(staff)
    }
}
