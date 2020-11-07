package com.app.expensetracker.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "expense")
public class Expense {

    @Id
    @GeneratedValue
    private Long id;

    private String expense;
    private String description;
}
