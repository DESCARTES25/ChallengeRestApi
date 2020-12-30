package com.postgresql.app.exceptions;

import com.postgresql.app.model.Itinerary;

public class RepeatedItinerariesFoundException extends RuntimeException {

    public RepeatedItinerariesFoundException(Itinerary itinerary) {

        super(String.format("Itinerary wirh Origin %s and Destination %s already exists", itinerary.getOrigin().getName(), itinerary.getDestination().getName()));
    }
    
  
}
