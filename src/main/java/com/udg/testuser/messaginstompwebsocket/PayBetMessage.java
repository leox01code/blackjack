package com.udg.testuser.messaginstompwebsocket;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PayBetMessage {
    String content;

    public PayBetMessage(String content) {
        this.content = content;
    }
}
