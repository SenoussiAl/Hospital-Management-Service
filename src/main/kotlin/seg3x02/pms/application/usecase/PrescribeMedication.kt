package seg3x02.pms.application.usecase

import seg3x02.pms.application.dtos.queries.MedicationPrescriptionDto

/**
 * @author : memo-aldu
 * @mailto : maldu064@uOttawa.ca
 * @created : 2023-10-19, Thursday
 **/
interface PrescribeMedication {
    /**
     * Prescribe medication to a patient (UC12)
     * @param prescription MedicationPrescriptionDto
     * @return Boolean true if medication was prescribed, false otherwise
     */
    fun prescribeMedication(prescription: MedicationPrescriptionDto) : Boolean
}