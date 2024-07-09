package com.udg.testuser.messaginstompwebsocket;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserMessage {

    String content;

    public UserMessage() {
    }

    public UserMessage(String content) {
        this.content = content;
    }

}
