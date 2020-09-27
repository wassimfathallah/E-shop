package com.wassim.Eshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

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
	public String saveProduct(@RequestParam("file") MultipartFile file, @RequestParam("color") String color,
			@RequestParam("marque") String marque, @RequestParam("name") String name,
			@RequestParam("price") float price, @RequestParam("qte") int qte, @RequestParam("size") String size
	/* @ModelAttribute("newPhone") EshopProduct newPhone */) {
		
		
		productService.createNewPhone(file, color, marque, name, price, qte, size);
		// productService.createNewPhone(newPhone);
		return "redirect:/";
	}

}
