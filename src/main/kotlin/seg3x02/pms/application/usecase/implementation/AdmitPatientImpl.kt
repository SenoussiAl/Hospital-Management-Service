package seg3x02.pms.application.usecase.implementation

import seg3x02.pms.application.dtos.queries.PatientAdmissionRequestDto
import seg3x02.pms.application.usecase.AdmitPatient

class AdmitPatientImpl: AdmitPatient {
    override fun admitPatientToDivision(patient: PatientAdmissionRequestDto): Boolean {
        TODO("Not yet implemented")
    }
}
