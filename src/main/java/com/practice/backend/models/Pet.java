package com.practice.backend.models;

import com.practice.backend.models.requestEntities.PetRequest;

import javax.persistence.*;

@Entity
@Table(name = "pet_info")
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nickname;
    private String breed;
    private Long cityId;

    public Pet(PetRequest request) {
        this.breed = request.getBreed();
        this.nickname = request.getNickname();
        this.cityId = request.getCityId();
    }

    public Pet() {}


    public Long getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }
}
