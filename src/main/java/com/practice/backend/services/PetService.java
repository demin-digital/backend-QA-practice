package com.practice.backend.services;

import com.practice.backend.models.Pet;
import com.practice.backend.models.PetDescription;
import com.practice.backend.repositories.PetDescriptionRepository;
import com.practice.backend.repositories.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {

    private final PetRepository petRepository;
    private final PetDescriptionRepository petDescriptionRepository;

    @Autowired
    public PetService(PetRepository petRepository, PetDescriptionRepository petDescriptionRepository) {
        this.petRepository = petRepository;
        this.petDescriptionRepository = petDescriptionRepository;
    }

    public Pet petAdding(Pet animal) {
        return petRepository.save(animal);
    }

    public List<Pet> getAllPetsEntries() {
        return petRepository.findAll();
    }

    public PetDescription getPetDescription(Long petId){
        return petDescriptionRepository.findByPetId(petId);
    }

    public PetDescription addNewDescription(PetDescription description){
        return petDescriptionRepository.save(description);
    }
}
