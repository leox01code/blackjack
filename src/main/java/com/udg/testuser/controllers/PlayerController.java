package com.udg.testuser.controllers;

import com.udg.testuser.models.Player;
import com.udg.testuser.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController()
@RequestMapping (path = "player")
public class PlayerController {

    @Autowired
    PlayerService playerService;


    @PostMapping()
    public Player savePlayer(@RequestBody Player player){
        return playerService.savePlayer(player);
    }

    @GetMapping()
    public List<Player> findAllPlayers(){
        return playerService.findAllPlayers();
    }

    @GetMapping("/findPlayerById/{id}")
    public Optional<Player> findPlayer(@PathVariable Long id){
        return playerService.findPlayer(id);
    }


    @GetMapping("/findPlayerByName/{name}")
    public Optional<List<Player>> findAllPlayersByName(@PathVariable String name){
        return  playerService.findAllPlayersByName(name);
    }

    @GetMapping("/findPlayerByEmail/{email}")
    public Optional<Player>  findPlayerByEmail(@PathVariable String email){
        return playerService.findPlayerByEmail(email);
    }

    @GetMapping("/findPlayerByUID/{UID}")
    public Optional<Player>  findPlayerByUID(@PathVariable String UID){
        return playerService.findPlayerByUID(UID);
    }

    @GetMapping("/findPlayerBalanceById/{id}")
    public Double getPlayerBalanceById(@PathVariable Long id){
        return playerService.getPlayerBalanceById(id);
    }

    @PatchMapping("/savePlayerBalanceById")
    public Double savePlayerBalanceById(@RequestBody Player player){
        return playerService.savePlayerBalanceById(player);
    }

    @PatchMapping("/savePlayerBalanceByUID")
    public Double savePlayerBalanceByUID(@RequestBody Player player){
        return playerService.savePlayerBalanceByUID(player);
    }


    @PatchMapping()
    public Player updatePlayerByID(@RequestBody Player player){
        return playerService.savePlayer(player);
    }

}
