package com.sathya.admin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.admin.entities.State;
import com.sathya.admin.services.StateService;


@RestController
@RequestMapping(path="/state")
public class StateController {
	@Autowired
	StateService stateService;
	
	@GetMapping(path="/getAllState")
	public Iterable<State> getAllState()
	{
		return stateService.getAllState();
		}
	
	@PostMapping(path="/addState")
	public State insertState(@RequestBody State state) {
		return stateService.insertState(state);
	}
	
	@PutMapping(path="/updateState")
	public State  updateState(@RequestBody State state) {
		return stateService.updateState(state);
		
	}
	
	@DeleteMapping(path="/deleteState/{id}")
	public void deleteState(@PathVariable("id") Integer id) {
		
		stateService.deleteState(id);		
	}

}
