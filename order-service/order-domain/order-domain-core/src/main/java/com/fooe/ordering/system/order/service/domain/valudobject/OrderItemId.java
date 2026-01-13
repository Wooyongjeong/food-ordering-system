package com.fooe.ordering.system.order.service.domain.valudobject;

import com.food.ordering.system.domain.valueobject.BaseId;

public class OrderItemId extends BaseId<Long> {
    protected OrderItemId(Long value) {
        super(value);
    }
}
