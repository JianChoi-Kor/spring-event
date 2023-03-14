package com.example.event.service;

import com.example.event.dto.MemberDto;
import com.example.event.event.SavedMemberEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Slf4j
@RequiredArgsConstructor
@Service
public class MemberService {

    //회원가입, 중복되었을 때?

    private final ApplicationEventPublisher eventPublisher;

    @Transactional
    public void signup(MemberDto memberDto) {
        SavedMemberEvent event = new SavedMemberEvent(memberDto);
        log.info("step 1");
        eventPublisher.publishEvent(event);
        log.info("step 2");
        log.info("step 3");

        if (memberDto.getName().equals("오류")) {
            throw new RuntimeException("RuntimeException!");
        }
    }
}
