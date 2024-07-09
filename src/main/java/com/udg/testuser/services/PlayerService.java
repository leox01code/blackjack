package com.udg.testuser.services;

import com.udg.testuser.models.Player;
import com.udg.testuser.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {

    @Autowired
    PlayerRepository playerRepository;
    public Player savePlayer(Player player){
        return playerRepository.save(player);
    }

    public List<Player> findAllPlayers(){
        return (List<Player>) playerRepository.findAll();
    }

    public Optional<Player> findPlayer(Long id){
        return playerRepository.findById(id);
    }

    public Optional<Player> findPlayerByUID(String UID){
        return playerRepository.findPlayerByUid(UID);
    }

    public Optional<List<Player>> findAllPlayersByName(String name){
        return Optional.ofNullable(playerRepository.findAllPlayersByName(name));
    }

    public Optional<Player>  findPlayerByEmail(String email){
        return playerRepository.findPlayerByEmail(email);
    }

    public Double getPlayerBalanceById(Long id){
        Optional<Player> player = playerRepository.findById(id);
        return player.map(Player::getBalance).orElse(null);
    }

    public Double savePlayerBalanceById(Player newPlayer){

        Optional<Player> playerFinded = playerRepository.findById(newPlayer.getId());
        if (playerFinded.isPresent()){
            Player player = playerFinded.get();
             if (newPlayer.getBalance() >= 0){
                 player.setBalance(newPlayer.getBalance());
                 return playerRepository.save(player).getBalance();
            }
        }

        return null;
    }

    public Double savePlayerBalanceByUID(Player newPlayer){

        Optional<Player> playerFinded = playerRepository.findPlayerByUid(newPlayer.getUid());
        if (playerFinded.isPresent()){
            Player player = playerFinded.get();
            if (newPlayer.getBalance() >= 0){
                player.setBalance(newPlayer.getBalance());
                return playerRepository.save(player).getBalance();
            }
        }

        return null;
    }
}
