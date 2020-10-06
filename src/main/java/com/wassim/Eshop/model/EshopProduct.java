package com.wassim.Eshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class EshopProduct {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String marque;
	private float price;

	private String color;
	private String size;
	private int qte;
	
	private String released;
	private String processeur;
	private int ram;
	private int rom;
	private String android;
	private String battery;
	private String 	camDorsale;
	private String camFrontale;
	@Lob
	@Column(columnDefinition = "MEDIUMBLOB")
	private String image;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}
	public String getReleased() {
		return released;
	}
	public void setReleased(String released) {
		this.released = released;
	}
	public String getProcesseur() {
		return processeur;
	}
	public void setProcesseur(String processeur) {
		this.processeur = processeur;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getRom() {
		return rom;
	}
	public void setRom(int rom) {
		this.rom = rom;
	}
	public String getAndroid() {
		return android;
	}
	public void setAndroid(String android) {
		this.android = android;
	}
	public String getBattery() {
		return battery;
	}
	public void setBattery(String battery) {
		this.battery = battery;
	}
	public String getCamDorsale() {
		return camDorsale;
	}
	public void setCamDorsale(String camDorsale) {
		this.camDorsale = camDorsale;
	}
	public String getCamFrontale() {
		return camFrontale;
	}
	public void setCamFrontale(String camFrontale) {
		this.camFrontale = camFrontale;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public EshopProduct() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EshopProduct(String name, String marque, float price, String color, String size, int qte, String released,
			String processeur, int ram, int rom, String android, String battery, String camDorsale, String camFrontale,
			String image) {
		super();
		this.name = name;
		this.marque = marque;
		this.price = price;
		this.color = color;
		this.size = size;
		this.qte = qte;
		this.released = released;
		this.processeur = processeur;
		this.ram = ram;
		this.rom = rom;
		this.android = android;
		this.battery = battery;
		this.camDorsale = camDorsale;
		this.camFrontale = camFrontale;
		this.image = image;
	}

}
