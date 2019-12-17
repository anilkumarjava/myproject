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

import com.sathya.rms.entity.Menu;
import com.sathya.rms.service.MenuService;

@RestController
@RequestMapping(path = "/menu")
public class MenuController {

	@Autowired
	MenuService menuService;

	@PostMapping("/addMenu")
	public Menu insertMenu(@RequestBody Menu menu) {
		return menuService.insertMenu(menu);
	}

	@PutMapping("/updateMenu")
	public Menu updateMenu(@RequestBody Menu menu) {
		return menuService.updateMenu(menu);

	}

	@DeleteMapping("/deleteMenu/{id}")
	public void deleteMenu(@PathVariable("id") Integer id) {
		menuService.deleteMenu(id);
	}

	@GetMapping("/getAllMenu")
	public Iterable<Menu> getAllMenu() {
		return menuService.getAllMenu();

	}

}