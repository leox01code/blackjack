package com.udg.testuser.messaginstompwebsocket;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserBet {
    String UID;
    Double amount;
    String gameName;
    String gameID;

    public UserBet(String UID, Double amount, String gameName, String gameID) {
        this.UID = UID;
        this.amount = amount;
        this.gameName = gameName;
        this.gameID = gameID;
    }

    public UserBet() {
    }

    @Override
    public String toString() {
        return "UserBet{" +
                "UID='" + UID + '\'' +
                ", amount=" + amount +
                ", gameName='" + gameName + '\'' +
                ", gameID='" + gameID + '\'' +
                '}';
    }
}
