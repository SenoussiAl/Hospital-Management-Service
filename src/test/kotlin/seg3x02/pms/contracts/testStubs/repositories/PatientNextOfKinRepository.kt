package seg3x02.pms.contracts.testStubs.repositories

import seg3x02.pms.domain.patient.entities.patient.PatientNextOfKin
import seg3x02.pms.domain.patient.repositories.PatientNextOfKinRepository
import java.util.*

class PatientNextOfKinRepository: PatientNextOfKinRepository {
    private val patientNextOfKins: MutableMap<UUID, PatientNextOfKin> = HashMap()
    override fun save(patientNextOfKin: PatientNextOfKin): PatientNextOfKin {
        patientNextOfKins[patientNextOfKin.id] = patientNextOfKin
        return patientNextOfKin
    }

    override fun findById(id: UUID): PatientNextOfKin? {
        return patientNextOfKins[id]
    }
}
