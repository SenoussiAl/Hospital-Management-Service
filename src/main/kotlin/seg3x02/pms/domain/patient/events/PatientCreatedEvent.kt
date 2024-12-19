package seg3x02.pms.domain.patient.events

import seg3x02.pms.domain.common.DomainEvent
import java.util.*

class PatientCreatedEvent(
    val id: UUID,
    val occurredOn: Date,
    val patientNAS: String
) : DomainEvent
