package com.postgresql.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.postgresql.app.model.City;
import com.postgresql.app.model.Itinerary;
import com.postgresql.app.service.ICityService;
import com.postgresql.app.service.IItineraryService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CityAPIController {

    @Autowired
    private ICityService cityService;

    @Autowired
    private IItineraryService itineraryService;

    
    @GetMapping("/cities")
    public List<City> findCities(Model model) {

        return (List<City>) cityService.findAll();
    }
    
    @GetMapping("/itineraries")
    public List<Itinerary> findItineraries(Model model) {

        return (List<Itinerary>) itineraryService.findAll();
    }
    
}