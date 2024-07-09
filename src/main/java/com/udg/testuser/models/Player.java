
package com.udg.testuser.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "players")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    private Long id;
    private String uid;
    private String name;
    private String email;
    private Date lastSignIn;
    private Double balance;
    private boolean active;
    private String type;
    private String platform;
    private int numberOfGamesPlayed;

}

