package seg3x02.pms.application.usecase.implementation

import seg3x02.pms.application.dtos.queries.PatientDischargeDto
import seg3x02.pms.application.usecase.DischargePatient
import seg3x02.pms.domain.patient.facade.PatientFacade

class DischargePatientImpl(
    private val patientFacade: PatientFacade
): DischargePatient {
    override fun dischargePatient(patient: PatientDischargeDto): Boolean {
        TODO("Not yet implemented")
    }
}
