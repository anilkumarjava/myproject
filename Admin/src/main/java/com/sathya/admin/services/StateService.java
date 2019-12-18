package com.sathya.admin.services;

import java.util.Optional;

import com.sathya.admin.entities.State;


public interface StateService {
	public Iterable<State> getAllState();
	
	public State insertState(State state);
	
   public State updateState(State state);
   
   public void deleteState(Integer id);
   
   public Optional<State> getByStId(String stid);

}
