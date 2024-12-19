package seg3x02.pms.application.dtos.queries

import java.sql.Date
import java.sql.Timestamp

data class PatientDischargeDto(
        val patientNAS: String,
        val dischargeReason: String,
        val dischargeDate: Date,
        val dischargeTime: Timestamp,
        val dischargeNurseNAS: String,
        val dischargeNotes: String?
)
