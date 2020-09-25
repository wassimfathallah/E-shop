package com.wassim.Eshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wassim.Eshop.model.EshopProduct;
import com.wassim.Eshop.repository.EshopProductRepository;


@Service
public class EshopProductServiceImpl implements EshopProductService {

	@Autowired
	EshopProductRepository repo;
	
	@Override
	public void createNewPhone(EshopProduct newPhone) {
		 this.repo.save(newPhone);
	}

	@Override
	public List<EshopProduct> getAllNewPhone() {
		
		return repo.findAll();
	}
}
