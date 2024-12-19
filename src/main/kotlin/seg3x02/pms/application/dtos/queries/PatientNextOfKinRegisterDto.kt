package seg3x02.pms.application.dtos.queries

import seg3x02.pms.application.enums.PatientKinRelationshipEnum

data class PatientNextOfKinRegisterDto(
        val firstName: String,
        val lastName: String,
        val phoneNumber: String,
        val address: AddressRegisterDto,
        val relationship: PatientKinRelationshipEnum
)
