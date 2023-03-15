package com.example.event.service;

import com.example.event.dto.MemberDto;
import com.example.event.event.SavedMemberEvent;
import com.example.event.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@RequiredArgsConstructor
@Service
public class MemberService {

    //회원가입, 중복되었을 때?

    private final MemberRepository memberRepository;
    private final ApplicationEventPublisher eventPublisher;

    @Transactional
    public void signup(MemberDto memberDto) {

        log.info("before publishEvent() method.");
        eventPublisher.publishEvent(new SavedMemberEvent(memberDto));
        log.info("after publishEvent() method.");

        if (memberDto.getName().equals("master")) {
            throw new RuntimeException("can not use this name.");
        }
    }
}
