package com.practice.backend.repositories;

import com.practice.backend.models.PetDescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PetDescriptionRepository extends JpaRepository<PetDescription, Long> {

    PetDescription findByPetId(@Param("pet_id") Long petId);
}
