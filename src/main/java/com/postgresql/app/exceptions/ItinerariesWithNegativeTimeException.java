package com.postgresql.app.exceptions;

import com.postgresql.app.model.Itinerary;

public class ItinerariesWithNegativeTimeException extends RuntimeException {

    public ItinerariesWithNegativeTimeException(Itinerary itinerary) {

        super(String.format("Itinerary Id %d has the an arrival time earlier thab departure time", itinerary.getId()));
    }
    
  
}
