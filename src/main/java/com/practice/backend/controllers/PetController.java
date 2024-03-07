package com.practice.backend.controllers;

import com.practice.backend.models.Pet;
import com.practice.backend.models.PetDescription;
import com.practice.backend.models.requestEntities.PetDescriptionRequest;
import com.practice.backend.models.requestEntities.PetRequest;
import com.practice.backend.models.responseEntities.PetAllEntriesResponse;
import com.practice.backend.services.PetService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pet")
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }


    @PostMapping("/add")
    public ResponseEntity<Pet> petAdd(@RequestBody PetRequest request) {
        return ResponseEntity.ok(petService.petAdding(new Pet(request)));
    }

    @GetMapping("/all_pets")
    public ResponseEntity<PetAllEntriesResponse> getPets() {
        return ResponseEntity.ok(new PetAllEntriesResponse(petService.getAllPetsEntries()));
    }

    @GetMapping("/description/{petId}")
    public ResponseEntity<PetDescription> getPetFullInfo(@PathVariable Long petId){
        return ResponseEntity.ok(petService.getPetDescription(petId));
    }

    @PostMapping("/description/add")
    public ResponseEntity<PetDescription> addPetDescription(@RequestBody PetDescriptionRequest request){
        return ResponseEntity.ok(petService
                .addNewDescription(new PetDescription(request.getPetId(), request.getShortDescription(), request.getFullDescription())));
    }
}
