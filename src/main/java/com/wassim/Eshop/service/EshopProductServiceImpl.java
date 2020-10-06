package com.wassim.Eshop.service;

import java.io.IOException;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.wassim.Eshop.model.EshopProduct;
import com.wassim.Eshop.repository.EshopProductRepository;

import antlr.StringUtils;

@Service
public class EshopProductServiceImpl implements EshopProductService {

	@Autowired
	EshopProductRepository repo;

	@Override
	public void createNewPhone(MultipartFile file, String color, String marque, String name, float price, int qte,
			String size, String released, String processeur, int ram, int rom, String android, String battery,String camfrontale,
			String camDorsale) {

		EshopProduct product = new EshopProduct();
		String fileName = org.springframework.util.StringUtils.cleanPath(file.getOriginalFilename());
		if (fileName.contains("..")) {
			System.out.println("not a avalid file!");
		}
		try {
			product.setImage(Base64.getEncoder().encodeToString(file.getBytes()));
		} catch (IOException e) {
			e.printStackTrace();
		}

		product.setColor(color);
		product.setMarque(marque);
		product.setName(name);
		product.setPrice(price);
		product.setQte(qte);
		product.setSize(size);

		product.setReleased(released);
		product.setProcesseur(processeur);
		product.setRam(ram);
		product.setRom(rom);
		product.setAndroid(android);
		product.setBattery(battery);
		product.setCamFrontale(camfrontale);
		product.setCamDorsale(camDorsale);
		
		repo.save(product);
	}

	@Override
	public List<EshopProduct> getAllNewPhone() {

		return repo.findAll();
	}

	@Override
	public EshopProduct getProductById(Long id) {
		// TODO Auto-generated method stub
		Optional<EshopProduct> optional = repo.findById(id);
		EshopProduct product = null;
		if (optional.isPresent()) {

			product = optional.get();
		} else {
			throw new RuntimeException("Product not found");
		}
		return product;
	}

}
