package com.sathya.rms.service;

import org.springframework.stereotype.Service;

import com.sathya.rms.entity.Menu;
@Service
public interface MenuService {

	public Menu insertMenu(Menu menu);

	public Menu updateMenu(Menu menu);

	public void deleteMenu(Integer id);

	public Iterable<Menu> getAllMenu();

}
