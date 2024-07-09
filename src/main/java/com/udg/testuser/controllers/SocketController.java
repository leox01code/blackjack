package com.udg.testuser.controllers;

import com.udg.testuser.messaginstompwebsocket.*;
import com.udg.testuser.models.BetModel;
import com.udg.testuser.models.Player;
import com.udg.testuser.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class SocketController {

    @Autowired
    PlayerRepository playerRepository;

    @MessageMapping("/user")
    @SendTo("/topic/user-data")
    public UserMessage saveUser(SaveUser user) throws Exception{
        Thread.sleep(1000);
        Player currentPlayer = new Player();
        currentPlayer.setBalance(user.getBalance());
        currentPlayer.setName(user.getName());
        currentPlayer.setUid(user.getUID());
        currentPlayer.setPlatform(user.getPlatform());
        saveUserData(currentPlayer);
        return new UserMessage(HtmlUtils.htmlEscape(user.toString()));
    }

    @MessageMapping("/create-bet")
    @SendTo("/topic/bets")
    public UserBetMessage createBet(UserBet userBet) throws Exception{
        Thread.sleep(1000);
        //TODO:Call saveUserBet

        return new UserBetMessage(HtmlUtils.htmlEscape(userBet.toString()));
    }

    @MessageMapping("/pay-bet")
    @SendTo("/topic/pay-bets")
    public PayBetMessage payBet(UserBet userBet) throws Exception{
        Thread.sleep(1000);
        //TODO:Call saveUserPayBet

        return new PayBetMessage(HtmlUtils.htmlEscape(userBet.toString()));
    }


    private void saveUserData(Player currentPlayer) {
        playerRepository.save(currentPlayer);
    }

    private void saveUserBet(BetModel bet){

    }

    private void savePayUserBet(BetModel payBet){

    }
}
