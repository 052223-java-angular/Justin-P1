package com.revature.MyGameList.entities;

import java.util.Set;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

//import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
@Table(name = "listT")
public class ListT {
    @Id
    private String id;


    @OneToOne(mappedBy = "listT", fetch = FetchType.LAZY)
    @JsonManagedReference
    private Set<User> users;


    @OneToMany(mappedBy = "listT", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<ListItem> listItems;

   

}