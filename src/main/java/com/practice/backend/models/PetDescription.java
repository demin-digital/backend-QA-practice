package com.practice.backend.models;

import javax.persistence.*;

@Entity
@Table(name = "pet_description")
public class PetDescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long petId;
    private String shortDescription;
    private String fullDescription;


    public PetDescription(Long petId, String shortDescription, String fullDescription) {
       this.petId = petId;
       this.shortDescription = shortDescription;
       this.fullDescription = fullDescription;
    }

    public PetDescription() {

    }

    public Long getId() {
        return id;
    }

    public Long getPetId() {
        return petId;
    }

    public void setPetId(Long petId) {
        this.petId = petId;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getFullDescription() {
        return fullDescription;
    }

    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }
}
