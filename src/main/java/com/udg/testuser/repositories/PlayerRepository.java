package com.udg.testuser.repositories;

import com.udg.testuser.models.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Long> {
    public List<Player> findAllPlayersByName(String name);
    public Optional<Player>  findPlayerByEmail(String email);

    public Optional<Player> findPlayerByUid(String uid);


}
