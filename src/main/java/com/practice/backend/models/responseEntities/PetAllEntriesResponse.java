package com.practice.backend.models.responseEntities;

import com.practice.backend.models.Pet;

import java.util.List;

public class PetAllEntriesResponse {
    private List<Pet> pets;

    public PetAllEntriesResponse(List<Pet> pets) {
        this.pets = pets;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }
}
