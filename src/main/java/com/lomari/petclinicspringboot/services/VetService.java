package com.lomari.petclinicspringboot.services;

import com.lomari.petclinicspringboot.model.Vet;

import java.util.Set;
import java.util.UUID;

public interface VetService {
    Vet findById(UUID id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
