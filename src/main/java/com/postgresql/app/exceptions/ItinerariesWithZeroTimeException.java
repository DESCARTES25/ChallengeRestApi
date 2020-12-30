package com.postgresql.app.exceptions;

import com.postgresql.app.model.Itinerary;

public class ItinerariesWithZeroTimeException extends RuntimeException {

    public ItinerariesWithZeroTimeException(Itinerary itinerary) {

        super(String.format("Itinerary Id %d has the same departure and arrival time", itinerary.getId()));
    }
    
  
}
