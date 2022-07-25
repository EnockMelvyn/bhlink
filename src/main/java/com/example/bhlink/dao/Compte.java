package com.example.bhlink.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "compte")
@Data
public class Compte{

    @Id
    @GeneratedValue
    private Long numCompte;

    private String agence;
}