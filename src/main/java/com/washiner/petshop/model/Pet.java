package com.washiner.petshop.model;

import java.time.LocalDate;

public class Pet {
    
    private Long id;
    private String name;
    private String breed;
    private String species;
    private LocalDate birthDate;

    // Construtores, getters e setters
    public Pet() {}

    public Pet(Long id, String name, String breed, String species, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.species = species;
        this.birthDate = birthDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}

