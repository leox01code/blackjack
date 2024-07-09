package com.udg.testuser.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "TableGames")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TableGame {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,unique = true)
    private Long id;

    //TODO: Max bet and min bet

}
