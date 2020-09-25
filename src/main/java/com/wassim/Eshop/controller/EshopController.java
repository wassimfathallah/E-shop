package com.wassim.Eshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.wassim.Eshop.model.EshopProduct;
import com.wassim.Eshop.service.EshopProductService;

@Controller
public class EshopController {
	
	
	@Autowired
	EshopProductService productService;

	@GetMapping("/")
	public String home(Model model) {
		// show all New Phones
		model.addAttribute("listNewPhone", productService.getAllNewPhone());
		return "index";
	}

	@GetMapping("/CreateNewPhone")
	public String createProduct(Model model) {
		EshopProduct newPhone = new EshopProduct();
		model.addAttribute("newPhone", newPhone);
		return "createNewPhone";
	}

	@PostMapping("/saveNewPhone")
	public String saveProduct(@ModelAttribute("newPhone") EshopProduct newPhone) {
		productService.createNewPhone(newPhone);
		return "redirect:/";
	}




}
