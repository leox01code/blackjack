package com.udg.testuser.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "bets")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BetModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)
    Long id;
    String userUID;
    Double betAmount;
    String gameName;
    Long gameId;
    String gameUID;
    String status;
    Date createdDate;
    String type;
}
