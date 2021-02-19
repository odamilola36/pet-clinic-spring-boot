package com.lomari.petclinicspringboot.services;

import com.lomari.petclinicspringboot.model.Owner;

import java.util.Set;
import java.util.UUID;

public interface OwnerService {
    Owner findByLastName(String lastName);
    Owner findById(UUID id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
