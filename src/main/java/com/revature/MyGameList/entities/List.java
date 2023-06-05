package com.revature.MyGameList.entities;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonManagedReference;

//import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
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
@Table(name = "list")
public class List {
    @Id
    private String id;


    @OneToOne(mappedBy = "list", fetch = FetchType.LAZY)
    @JsonManagedReference
    private Set<User> users;
}