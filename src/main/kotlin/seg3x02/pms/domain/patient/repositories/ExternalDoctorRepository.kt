package seg3x02.pms.domain.patient.repositories

import seg3x02.pms.domain.patient.entities.patient.ExternalDoctor
import java.util.UUID

interface ExternalDoctorRepository {
    fun findById(id: UUID): ExternalDoctor?
    fun save(externalDoctor: ExternalDoctor): ExternalDoctor
}
