package com.fooe.ordering.system.order.service.domain.valudobject;

import com.food.ordering.system.domain.valueobject.BaseId;

import java.util.UUID;

public class TrackingId extends BaseId<UUID> {
    protected TrackingId(UUID value) {
        super(value);
    }
}
