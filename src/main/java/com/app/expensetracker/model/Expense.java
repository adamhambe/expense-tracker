package com.app.expensetracker.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "expense")
public class Expense {

    @Id
    @GeneratedValue
    private Long id;

    private double amount;
    private String description;

    @ManyToOne
    @JsonIgnore
    private Category category;

}
