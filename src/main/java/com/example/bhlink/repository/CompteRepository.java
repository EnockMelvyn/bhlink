package com.example.bhlink.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bhlink.dao.Compte;

public interface CompteRepository extends JpaRepository<Compte,Long>{

}