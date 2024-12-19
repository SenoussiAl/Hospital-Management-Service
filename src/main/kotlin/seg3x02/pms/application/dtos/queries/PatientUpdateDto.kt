package seg3x02.pms.application.dtos.queries

import seg3x02.pms.application.enums.MaritalStatusEnum
import java.sql.Date
import java.util.*

data class PatientUpdateDto(
        /**
         * All the fields that can be updated except for the NAS
         */
        val firstName: String?,
        val lastName: String?,
        val phoneNumber: String?,
        val dob: Date?,
        val gender: String?,
        val maritalStatus: MaritalStatusEnum?,
        val externalDoctorID: UUID?,
        var address: AddressRegisterDto?,
        var nextOfKin: PatientNextOfKinRegisterDto?
)
