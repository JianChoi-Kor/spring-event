package com.example.event.controller;

import com.example.event.dto.MemberDto;
import com.example.event.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/signup")
    public void signup() {
//        MemberDto memberDto = new MemberDto(1L, "jan");
        MemberDto memberDto = new MemberDto(2L, "오류");
        try {
            memberService.signup(memberDto);
        } catch (RuntimeException e) {

        }
    }
}
