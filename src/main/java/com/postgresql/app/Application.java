package com.postgresql.app;

import java.time.LocalTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.postgresql.app.model.City;
import com.postgresql.app.model.Itinerary;
import com.postgresql.app.repository.CityRepository;
import com.postgresql.app.repository.ItineraryRepository;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

/*	@Bean
	public CommandLineRunner demo(CityRepository repository, ItineraryRepository itRepository) {
		return (args) -> {
			// Save a few cities

			City madrid = new City("Madrid");
			City londres = new City("Londres");
			City berlin = new City("Berlin");
			City tokyo = new City("Tokyo");
			City paris = new City("Paris");
			City newYork = new City("New York");

			repository.save(madrid);
			repository.save(londres);
			repository.save(berlin);
			repository.save(tokyo);
			repository.save(paris);
			repository.save(newYork);

			// Fetch all cities
			log.info("Cities found with findAll():");
			log.info("-------------------------------");
			for (City city : repository.findAll()) {
				log.info(city.toString());
			}
			log.info("");

			// Save a few itineraries
			itRepository.save(new Itinerary(madrid, berlin, LocalTime.of(0, 0), LocalTime.of(1, 0)));
			itRepository.save(new Itinerary(madrid, paris, LocalTime.of(0, 0), LocalTime.of(2, 0)));
			itRepository.save(new Itinerary(paris, londres, LocalTime.of(1, 0), LocalTime.of(3, 0)));
			itRepository.save(new Itinerary(paris, newYork, LocalTime.of(1, 0), LocalTime.of(5, 0)));
			itRepository.save(new Itinerary(berlin, tokyo, LocalTime.of(6, 0), LocalTime.of(7, 0)));
			itRepository.save(new Itinerary(londres, tokyo, LocalTime.of(10, 0), LocalTime.of(12, 0)));
			itRepository.save(new Itinerary(newYork, tokyo, LocalTime.of(15, 0), LocalTime.of(20, 0)));

			// Fetch all itineraries
			log.info("Itineraries found with findAll():");
			log.info("-------------------------------");
			for (Itinerary itinerary : itRepository.findAll()) {
				log.info(itinerary.toString());
			}
			log.info("");

		}; 
	}*/

}
