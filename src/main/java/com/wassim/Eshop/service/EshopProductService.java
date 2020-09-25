package com.wassim.Eshop.service;

import java.util.List;

import com.wassim.Eshop.model.EshopProduct;


public interface EshopProductService {
	void createNewPhone(EshopProduct newPhone);
	List<EshopProduct> getAllNewPhone();
}
