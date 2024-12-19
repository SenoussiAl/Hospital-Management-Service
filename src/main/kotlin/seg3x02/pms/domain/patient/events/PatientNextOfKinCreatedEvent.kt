package seg3x02.pms.domain.patient.events

import seg3x02.pms.domain.common.DomainEvent
import java.util.*

class PatientNextOfKinCreatedEvent(
    val id: UUID,
    val occurredOn: Date,
    val nextOfKinId: UUID
) : DomainEvent
