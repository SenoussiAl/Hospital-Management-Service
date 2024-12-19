package seg3x02.pms.application.dtos.queries

data class PatientAdmissionToDivisionDto(
        val patientNAS: String,
        val requestingChargedNurseNAS: String,
        val approvingChargedNurseNAS: String,
        val roomNumber: Int,
        val bedNumber: Int,
        val optionPrivateInsuranceNumber: String?,
)
