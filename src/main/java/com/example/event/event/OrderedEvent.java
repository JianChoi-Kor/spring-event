package com.example.event.event;

import org.springframework.context.ApplicationEvent;

public class OrderedEvent {

    private String productName;

    public OrderedEvent(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }
}
