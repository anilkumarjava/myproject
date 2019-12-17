package com.sathya.rms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.rms.entity.Shift;
import com.sathya.rms.service.ShiftService;

@RestController
@RequestMapping(path = "/shift")
public class ShiftController {

	@Autowired
	ShiftService shiftService;

	@PostMapping("/addShift")
	public Shift insertShift(@RequestBody Shift shift) {
		return shiftService.insertShift(shift);

	}

	@PutMapping("/updateShift")
	public Shift updateShift(@RequestBody Shift shift) {
		return shiftService.updateShift(shift);

	}

	@DeleteMapping("/deleteShift/{id}")
	public void deleteShift(@PathVariable("id") Integer id) {
		shiftService.deleteShift(id);

	}

	@GetMapping("/getAllShift")
	public Iterable<Shift> getAllShift() {
		return shiftService.getAllShift();

	}

}
