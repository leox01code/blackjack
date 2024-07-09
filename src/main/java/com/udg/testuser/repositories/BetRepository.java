package com.udg.testuser.repositories;

import com.udg.testuser.models.BetModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BetRepository extends CrudRepository<BetModel, Long> {

    public Optional<BetModel> findBetByUserUID(String uid);
}
