package com.udg.testuser.messaginstompwebsocket;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserBetMessage {

    String content;

    public UserBetMessage(String content) {
        this.content = content;
    }
}
