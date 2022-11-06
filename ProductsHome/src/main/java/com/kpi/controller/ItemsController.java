package com.kpi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kpi.entity.Items;
import com.kpi.service.ItemsService;

import java.util.List;

@Controller
public class ItemsController {

	@Autowired
	ItemsService service;
	
	/* @GetMapping("/allproducts")
	public List<Items> showProducts() {
		return service.getProductList();
	}
	
	@GetMapping("/onlyproducts")
	public List<String> showOnlyProducts() {
		return service.getOnlyProductList();					replace @Controller with @RestController to use the functions.
	} */
	
	@RequestMapping("/products")
	public String listProducts(Model model) {
		model.addAttribute("items", service.getProductList());
		return "products";
	}
	
	@RequestMapping("/addedtocart")
	public String added() {
		return "cart";
	}
	
}
