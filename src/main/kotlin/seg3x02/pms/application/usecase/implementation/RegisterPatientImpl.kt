package seg3x02.pms.application.usecase.implementation

import seg3x02.pms.application.dtos.queries.PatientRegisterDto
import seg3x02.pms.application.usecase.RegisterPatient
import seg3x02.pms.domain.patient.facade.PatientFacade
import seg3x02.pms.domain.staff.facade.StaffFacade

class RegisterPatientImpl(
    private var patientFacade: PatientFacade,
): RegisterPatient {

    override fun registerPatient(patient: PatientRegisterDto): String? {
        return patientFacade.registerPatient(patient)
    }
}
