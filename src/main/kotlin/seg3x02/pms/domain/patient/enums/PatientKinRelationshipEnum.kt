package seg3x02.pms.domain.patient.enums

enum class PatientKinRelationshipEnum {
    MOTHER,
    FATHER,
    SIBLING,
    SPOUSE,
    CHILD,
    GUARDIAN,
    OTHER;


    fun fromInt(value: Int): PatientKinRelationshipEnum {
        return when (value) {
            0 -> MOTHER
            1 -> FATHER
            2 -> SIBLING
            3 -> SPOUSE
            4 -> CHILD
            5 -> GUARDIAN
            6 -> OTHER
            else -> throw IllegalArgumentException("Invalid patient kin relationship value")
        }
    }

    fun toInt(): Int {
        return when (this) {
            MOTHER -> 0
            FATHER -> 1
            SIBLING -> 2
            SPOUSE -> 3
            CHILD -> 4
            GUARDIAN -> 5
            OTHER -> 6
        }
    }
}
