package com.wassim.Eshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wassim.Eshop.model.EshopProduct;

public interface EshopProductRepository extends JpaRepository<EshopProduct, Long> {

}
