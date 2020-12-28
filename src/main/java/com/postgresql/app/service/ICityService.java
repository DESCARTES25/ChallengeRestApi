package com.postgresql.app.service;


import com.postgresql.app.model.City;

import java.util.List;

public interface ICityService {

    List<City> findAll();
}