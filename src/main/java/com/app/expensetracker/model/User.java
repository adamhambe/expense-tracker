package com.app.expensetracker.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String email;

//    @OneToMany
//    private Category category;

}
