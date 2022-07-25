package com.example.bhlink.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bhlink.dao.Compte;
import com.example.bhlink.repository.CompteRepository;

@RestController
@RequestMapping("/comptes")
@CrossOrigin
public class CompteController{
    @Autowired
    private CompteRepository compteRepository;

    @GetMapping("/")
    public List<Compte> getAllComptes(){
        return compteRepository.findAll();
    }

    @GetMapping("/{id}")
    public Compte getCompteById(@PathVariable Long id){
        return compteRepository.findById(id).orElse(null);
    }
}