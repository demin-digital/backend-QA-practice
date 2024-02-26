package com.practice.backend.controllers;

import com.practice.backend.models.City;
import com.practice.backend.models.requestEntities.CityRequest;
import com.practice.backend.models.responseEntities.CityResponse;
import com.practice.backend.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cities")
public class CityController {

    private final CityService cityService;

    @Autowired
    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/get_list")
    public ResponseEntity<CityResponse> getCities() {
        return ResponseEntity.ok(new CityResponse(cityService.getCitiesDB()));
    }

    @PostMapping("/add")
    public ResponseEntity<City> addCity(@RequestBody CityRequest cityRequest) {
        City newCity = cityService.addCity(cityRequest.getCityName());
        return ResponseEntity.ok(newCity);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCityById(@PathVariable("id") Long id) {
        return cityService.deleteCityById(id);
    }
}