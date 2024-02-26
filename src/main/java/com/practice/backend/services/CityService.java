package com.practice.backend.services;

import com.practice.backend.models.City;
import com.practice.backend.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CityService {

    private final CityRepository cityRepository;

    @Autowired
    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public List<City> getCitiesDB() {
        List<City> cities = new ArrayList<>();
        cities = cityRepository.findAll(Sort.by(Sort.Direction.DESC, "cityId"));

        return cities;
    }

    public City addCity(String cityName) {
        City newCity = new City();
        newCity.setName(cityName);
        return cityRepository.save(newCity);
    }

    public ResponseEntity<String> deleteCityById(Long id) {
        try {
            cityRepository.deleteById(id);
            return ResponseEntity.ok("Город с ID " + id + " успешно удален");
        } catch (EmptyResultDataAccessException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Город с ID " + id + " не найден");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ошибка при удалении города");
        }
    }
}