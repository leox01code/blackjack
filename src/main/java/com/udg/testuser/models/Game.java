package com.udg.testuser.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "games")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,unique = true)
    private Long id;
    private Date date;
    @OneToMany //maximum player number = 7
    private List<Player> players;
    @OneToMany
    private List<Player> winnerPlayers;
    @OneToMany
    private List<Player> looserPlayers;
    private String status;
    private String type;
    //TODO: puestas ganadas, apuestas perdidas

}
