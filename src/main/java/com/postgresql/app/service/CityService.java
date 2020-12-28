package com.postgresql.app.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.postgresql.app.model.City;
import com.postgresql.app.repository.CityRepository;

@Service
public class CityService implements ICityService {

    @Autowired
    private CityRepository repository;

    @Override
    public List<City> findAll() {

        var cities = (List<City>) repository.findAll();

        return cities;
    }
}
