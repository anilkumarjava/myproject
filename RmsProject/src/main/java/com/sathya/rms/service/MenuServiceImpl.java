package com.sathya.rms.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.data.MenuRepository;
import com.sathya.rms.entity.Menu;

@Service
public class MenuServiceImpl implements MenuService {

	@Autowired
	MenuRepository menuRepository;

	@Transactional
	public Menu insertMenu(Menu menu) {

		return menuRepository.save(menu);
	}

	@Transactional
	public Menu updateMenu(Menu menu) {

		return menuRepository.save(menu);
	}

	@Override
	public void deleteMenu(Integer id) {

		menuRepository.deleteById(id);

	}

	@Override
	public Iterable<Menu> getAllMenu() {

		return menuRepository.findAll();
	}

}
