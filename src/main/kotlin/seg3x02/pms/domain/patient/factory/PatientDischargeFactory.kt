package seg3x02.pms.domain.patient.factory

import seg3x02.pms.application.dtos.queries.PatientDischargeDto
import seg3x02.pms.domain.patient.entities.admission.PatientDischarge

interface PatientDischargeFactory {
    fun createPatientDischarge(patientDischargeDto: PatientDischargeDto): PatientDischarge
}
