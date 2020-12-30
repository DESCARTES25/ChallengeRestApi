package com.postgresql.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.postgresql.app.exceptions.CityNotFoundException;
import com.postgresql.app.exceptions.DuplicateCityException;
import com.postgresql.app.exceptions.NoCitiesFoundException;
import com.postgresql.app.model.City;
import com.postgresql.app.repository.CityRepository;


@Service
@Qualifier("com.postgresql.app.service.CityService")
public class CityService implements ICityService {

	/*@Autowired
	private CityRepository cityRepository;
*/
	private final CityRepository cityRepository;
	
	public CityService(CityRepository cityRepository) {
		this.cityRepository = cityRepository;
		
	}
	@Override
    public City save(City city) {
		//Checks duplicate Cities and returns a controlled exception
		if (cityRepository.existsByName(city.getName())){
			throw new DuplicateCityException(city.getName());
		}
		return cityRepository.save(city);
    }
	
	@Override
	public long count() {
		return cityRepository.count();
	}
	
	@Override
	public List<City> findAll() {
		
		var cities = (List<City>) cityRepository.findAll();

		if (cities.isEmpty()) {

			throw new NoCitiesFoundException();
		}

		return cities;

	}

	@Override
	public City findByName(String name) {
		Optional<City> op = cityRepository.findByName(name);
		return op.orElseThrow(() -> new CityNotFoundException(name));
	}

	@Override
	public City findById(long id) {
		Optional<City> op = cityRepository.findById(id);
		return op.orElseThrow(() -> new CityNotFoundException(id));
	}

	@Override
	public boolean existsByName(String name) {
		return cityRepository.existsByName(name);
	}
}