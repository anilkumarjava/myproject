package com.sathya.rms.service;

import org.springframework.stereotype.Service;

import com.sathya.rms.entity.Shift;

@Service
public interface ShiftService {

	public Shift insertShift(Shift shift);

	public Shift updateShift(Shift shift);

	public void deleteShift(Integer id);

	public Iterable<Shift> getAllShift();

}
