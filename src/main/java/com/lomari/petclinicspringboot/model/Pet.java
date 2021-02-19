package com.lomari.petclinicspringboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@AllArgsConstructor
@Data
public class Pet {

    private PetType petType;
    private Owner owner;
    private LocalDate date;
}
