package seg3x02.pms.domain.patient.facade

import seg3x02.pms.application.dtos.queries.*
import seg3x02.pms.domain.patient.entities.patient.Address
import seg3x02.pms.domain.patient.entities.patient.PatientNextOfKin
import seg3x02.pms.domain.staff.entities.Staff
import java.util.UUID

interface PatientFacade {
    fun registerPatient(patient: PatientRegisterDto): String?
    fun updatePatientFile(updatedPatient: PatientUpdateDto, patientNAS: String): Boolean

}
