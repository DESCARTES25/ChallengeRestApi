package com.postgresql.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.postgresql.app.model.City;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {

}