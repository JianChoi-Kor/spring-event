package com.example.event.event;

import com.example.event.dto.MemberDto;
import com.example.event.entity.Member;
import lombok.ToString;

@ToString
public class SavedMemberEvent {

    private MemberDto memberDto;

    public SavedMemberEvent(MemberDto memberDto) {
        this.memberDto = memberDto;
    }

    public Member getMember() {
        return new Member(memberDto.getId(), memberDto.getName());
    }
}
