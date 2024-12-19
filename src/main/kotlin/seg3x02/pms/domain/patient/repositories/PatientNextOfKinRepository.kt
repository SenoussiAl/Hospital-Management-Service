package seg3x02.pms.domain.patient.repositories

import seg3x02.pms.domain.patient.entities.patient.PatientNextOfKin
import java.util.UUID

interface PatientNextOfKinRepository {
    fun save(patientNextOfKin: PatientNextOfKin): PatientNextOfKin
    fun findById(id: UUID): PatientNextOfKin?
}
