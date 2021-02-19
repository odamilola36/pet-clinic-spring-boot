package com.lomari.petclinicspringboot.services;

import com.lomari.petclinicspringboot.model.Pet;

import java.util.Set;
import java.util.UUID;

public interface PetService {
    Pet findById(UUID id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
