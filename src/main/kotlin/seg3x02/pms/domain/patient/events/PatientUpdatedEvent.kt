package seg3x02.pms.domain.patient.events

import seg3x02.pms.domain.common.DomainEvent
import java.util.*

class PatientUpdatedEvent(
    val id: UUID,
    val occurredOn: Date,
    val patientId: String
) : DomainEvent
