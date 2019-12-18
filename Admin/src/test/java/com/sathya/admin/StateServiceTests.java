package com.sathya.admin;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sathya.admin.entities.State;
import com.sathya.admin.services.StateService;

@SpringBootTest
class StateServiceTests {

	@Autowired
	private StateService stateService;

	@Test
	@Ignore
	public void getAllStates()throws Exception {
		assertTrue(stateService.getAllState().iterator().hasNext());
	}
	@Test
	@Ignore
	public void insertState()throws Exception {
		    
		State st=new State();
		st.setStid("st9");
		st.setStname("deepak");
		stateService.insertState(st);
		assertTrue(stateService.getByStId("st9").isPresent());
	}
	@Test
	public void deleteState()throws Exception {
		  stateService.deleteState(61);
		  assertNull(stateService.getByStId("st9"));
	
	}
}
