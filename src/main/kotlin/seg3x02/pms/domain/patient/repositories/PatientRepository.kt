package seg3x02.pms.domain.patient.repositories

import seg3x02.pms.domain.patient.entities.patient.Patient

interface PatientRepository {
    fun findById(nas: String): Patient?
    fun save(patient: Patient): Patient
}
