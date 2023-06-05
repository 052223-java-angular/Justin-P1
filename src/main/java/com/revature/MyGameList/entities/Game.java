package com.revature.MyGameList.entities;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "games")
public class Game {
    @Id
    private String id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private double price;

    @Column(nullable = false)
    private String description;

    @ManyToOne
    @JoinColumn(name = "genre_id")
    @JsonBackReference
    private Genre genre;


    public Game(String name, double price, String description, Genre genre) {
        this.name = name;
        this.price = price;
        this.genre = genre;
        this.id = UUID.randomUUID().toString();
    }
}