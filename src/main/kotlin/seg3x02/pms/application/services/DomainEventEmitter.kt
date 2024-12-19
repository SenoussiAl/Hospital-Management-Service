package seg3x02.pms.application.services

import seg3x02.pms.domain.common.DomainEvent

interface DomainEventEmitter {
    fun emit(event: DomainEvent)
}
