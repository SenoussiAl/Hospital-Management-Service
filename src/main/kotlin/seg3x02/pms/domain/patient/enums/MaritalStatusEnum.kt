package seg3x02.pms.domain.patient.enums

enum class MaritalStatusEnum {
    SINGLE,
    MARRIED,
    DIVORCED,
    WIDOWED,
    SEPARATED;

    fun formInt(value: Int): MaritalStatusEnum {
        return when (value) {
            0 -> SINGLE
            1 -> MARRIED
            2 -> DIVORCED
            3 -> WIDOWED
            4 -> SEPARATED
            else -> throw IllegalArgumentException("Invalid marital status value")
        }
    }

    fun toInt(): Int {
        return when (this) {
            SINGLE -> 0
            MARRIED -> 1
            DIVORCED -> 2
            WIDOWED -> 3
            SEPARATED -> 4
        }
    }
}
