package com.udg.testuser.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Entity
@Table(name = "Hands")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class HandPlayer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,unique = true)
    private Long id;
    private Date date;
    //TODO: cartas, apuesta


}
