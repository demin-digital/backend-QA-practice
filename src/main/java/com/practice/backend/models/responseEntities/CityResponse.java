package com.practice.backend.models.responseEntities;

import com.practice.backend.models.City;

import java.util.List;

public class CityResponse {
    public List<City> getCities() {
        return cities;
    }

    public CityResponse(List<City> cities) {
        this.cities = cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    private List<City> cities;
}
