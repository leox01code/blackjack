package com.udg.testuser.messaginstompwebsocket;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PayBet {
    String UID;
    Double payAmount;
    String status;
    String gameName;
    String gameID;

    public PayBet(String UID, Double payAmount, String status, String gameName, String gameID) {
        this.UID = UID;
        this.payAmount = payAmount;
        this.status = status;
        this.gameName = gameName;
        this.gameID = gameID;
    }

    public PayBet() {
    }
}
