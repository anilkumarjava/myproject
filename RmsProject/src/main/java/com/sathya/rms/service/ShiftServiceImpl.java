package com.sathya.rms.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.data.ShiftRepository;
import com.sathya.rms.entity.Shift;

@Service
public class ShiftServiceImpl implements ShiftService {

	@Autowired
	ShiftRepository shiftRepository;

	@Transactional
	public Shift insertShift(Shift shift) {

		return shiftRepository.save(shift);
	}

	@Transactional
	public Shift updateShift(Shift shift) {

		return shiftRepository.save(shift);
	}

	@Transactional
	public void deleteShift(Integer id) {

		shiftRepository.deleteById(id);
	}

	@Override
	public Iterable<Shift> getAllShift() {

		return shiftRepository.findAll();
	}

}
