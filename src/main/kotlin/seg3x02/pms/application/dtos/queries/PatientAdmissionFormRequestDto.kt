package seg3x02.pms.application.dtos.queries

import java.util.UUID

data class PatientAdmissionFormRequestDto(
        val requestId: UUID, // the request id found in the request list
        val localAcceptingChargedNurseNAS: String,
)
