package com.postgresql.app.exceptions;

import com.postgresql.app.model.City;

public class NoOriginOrDestinationForCityFoundException extends RuntimeException {

    public NoOriginOrDestinationForCityFoundException(City city) {

        super(String.format("No origin or destination found for City: %s" , city.getName()));
    }
}


