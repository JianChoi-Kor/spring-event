package com.example.event.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class OrderedEventListener {

//    @Async
    @EventListener
    public void sendPush(OrderedEvent event) throws InterruptedException {
        Thread.sleep(2000);  //2초
        log.info(String.format("푸시 메세지 발송 [상품명 : %s]", event.getProductName()));
    }

//    @Async
    @EventListener
    public void sendMail(OrderedEvent event) throws InterruptedException {
        Thread.sleep(3000);  //3초
        log.info(String.format("메일 전송 [상품명 : %s]", event.getProductName()));
    }
}
