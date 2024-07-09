package com.udg.testuser.messaginstompwebsocket;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SaveUser {
    private String name;

    private String UID;

    private Double balance;

    private String platform;
    private String email;


    public SaveUser() {
    }

    public SaveUser(String name, String UID, Double balance, String platform) {
        this.name = name;
        this.UID = UID;
        this.balance = balance;
        this.platform = platform;
    }

    @Override
    public String toString() {
        return "UserMessage{" +
                "name='" + name + '\'' +
                ", UID='" + UID + '\'' +
                ", balance=" + balance +
                ", platform='" + platform + '\'' +
                '}';
    }
}
