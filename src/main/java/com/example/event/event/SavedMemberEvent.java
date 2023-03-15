package com.example.event.event;

import com.example.event.dto.MemberDto;
import lombok.ToString;

@ToString
public class SavedMemberEvent {

    private MemberDto memberDto;

    public SavedMemberEvent(MemberDto memberDto) {
        this.memberDto = memberDto;
    }
}
