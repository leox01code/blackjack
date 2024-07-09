package com.udg.testuser.services;

import com.udg.testuser.models.BetModel;
import com.udg.testuser.repositories.BetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BetService {

    @Autowired
    BetRepository betRepository;


    public BetModel saveBet(BetModel betModel){
        return betRepository.save(betModel);
    }

    public List<BetModel> getAll(){
        return (List<BetModel>) betRepository.findAll();
    }

    public Optional<BetModel> findBetById(Long id){
        return  betRepository.findById(id);
    }

    public Optional<BetModel> findBetByUserUID(String uid){
        return betRepository.findBetByUserUID(uid);
    }
}
