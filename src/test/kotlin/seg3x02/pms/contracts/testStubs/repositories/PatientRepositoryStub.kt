package seg3x02.pms.contracts.testStubs.repositories

import seg3x02.pms.domain.patient.entities.patient.Patient
import seg3x02.pms.domain.patient.repositories.PatientRepository


class PatientRepositoryStub: PatientRepository {
    private val patients: MutableMap<String, Patient> = HashMap()
    override fun findById(nas: String): Patient? {
        return patients[nas]
    }

    override fun save(patient: Patient): Patient {
        patients[patient.nas] = patient
        return patient
    }
}
