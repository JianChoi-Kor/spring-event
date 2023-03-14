package com.example.event.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

@Slf4j
@Component
public class MemberEventListener {

    @EventListener
    public void defaultEventListener(SavedMemberEvent event) {
        log.info("defaultEventListener ---> {}", event);
    }

    @TransactionalEventListener(phase = TransactionPhase.BEFORE_COMMIT)
    public void transactionalEventListenerBeforeCommit(SavedMemberEvent event) {
        log.info("TransactionPhase.BEFORE_COMMIT ---> {}", event);
    }

    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
    public void transactionalEventListenerAfterCommit(SavedMemberEvent event) {
        log.info("TransactionPhase.AFTER_COMMIT ---> {}", event);
    }

    @TransactionalEventListener(phase = TransactionPhase.AFTER_ROLLBACK)
    public void transactionalEventListenerAfterRollback(SavedMemberEvent event) {
        log.info("TransactionPhase.AFTER_ROLLBACK ---> {}", event);
    }

    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMPLETION)
    public void transactionalEventListenerAfterCompletion(SavedMemberEvent event) {
        log.info("TransactionPhase.AFTER_COMPLETION ---> {}", event);
    }
}
