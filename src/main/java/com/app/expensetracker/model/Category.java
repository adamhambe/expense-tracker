package com.app.expensetracker.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue
    private Long id;

    private String category;

//    @ManyToOne
//    private User user;


}
