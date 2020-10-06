package com.wassim.Eshop.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.wassim.Eshop.model.EshopProduct;


public interface EshopProductService {
	void createNewPhone(MultipartFile file, String color,String marque,String name,float price,int qte,String size,
			

			 String released,
			 String processeur,
			 int ram,
			 int rom,
			 String android,
			 String battery,
			 String camfrontale,
			String camDorsale
			 );
	List<EshopProduct> getAllNewPhone();
	public EshopProduct getProductById(Long id);
}
