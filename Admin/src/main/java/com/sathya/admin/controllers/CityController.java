	package com.sathya.admin.controllers;

import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.admin.entities.City;
import com.sathya.admin.entities.State;
import com.sathya.admin.services.CityService;
import com.sathya.admin.services.StateService;

@RestController
@RequestMapping(path="/cities")
public class CityController {
	private static final Logger logger = LogManager.getLogger(CityController.class);
	
	@Autowired
   private CityService cityService;
	@Autowired
	private StateService stateService;
	@GetMapping(path = "/getAllCities")
	public	Iterable<City>	getAllCity(){
		logger.info("get All Cities method execution started");
		Iterable<City> result = null;
		try {
			
			result = cityService.getAllCity();
			logger.debug("result is {0}",result);
		}
		catch(Exception e) {
			logger.error("exception happens and exception info is {0} ",e);
		}
		logger.info("get All Cities method execution completed");
		
		return result;
	}
	
	@PostMapping(path = "/addCity")
	public City insertCity(@RequestBody City city) {
		logger.info("insertCity method execution started");
		
		logger.debug("input data is {0}",city);
		Optional<State> oState=stateService.getByStId(city.getStid());
		City result= null;
		try {
			city.setState(oState.get());
			if(oState.get()==null)
				throw new Exception("invalid state id");
			result=cityService.insertCity(city);
			logger.debug("result is {0}",result);
		}
		catch(Exception e) {
			logger.error("input data is {0}",city);
		}
		logger.info("insertCity method execution completed");
		return result;
	}
	
	@PutMapping(path="/updateCity")
	public City updateCity(@RequestBody City city) {
		return cityService.updateCity(city);
	}
	
	@DeleteMapping(path="/deleteCity/{id}")
	public void deleteCity(@PathVariable("id") Integer id) {
		cityService.deleteCity(id);
	}
}
