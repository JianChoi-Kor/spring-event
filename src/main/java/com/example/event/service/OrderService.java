package com.example.event.service;

import com.example.event.event.OrderedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OrderService {

    ApplicationEventPublisher publisher;

    public OrderService(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }

    public void order(String productName) {
        //주문 처리
        log.info(String.format("주문 로직 처리 [상품명 : %s]", productName));
        publisher.publishEvent(new OrderedEvent(productName));
    }
}
