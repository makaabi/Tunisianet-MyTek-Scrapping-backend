package com.projet.spring.data.mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

public class Product {
  private String id;

  private String name;
  private String image;
  private String description;
  private String price_dt;
  private float price;
  private boolean hasDiscount;
  private float price_before_discount;
  private boolean in_stock;
  
  private String url;
  private String site;
  private String manufacturer;
  private String manufacturer_logo;

  public Product() {

  }

public Product(String id, String name, String image, String description, String price_dt, float price,
		boolean hasDiscount, float price_before_discount, boolean in_stock, String url, String site,
		String manufacturer, String manufacturer_logo) {
	super();
	this.id = id;
	this.name = name;
	this.image = image;
	this.description = description;
	this.price_dt = price_dt;
	this.price = price;
	this.hasDiscount = hasDiscount;
	this.price_before_discount = price_before_discount;
	this.in_stock = in_stock;
	this.url = url;
	this.site = site;
	this.manufacturer = manufacturer;
	this.manufacturer_logo = manufacturer_logo;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getImage() {
	return image;
}

public void setImage(String image) {
	this.image = image;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public String getPrice_dt() {
	return price_dt;
}

public void setPrice_dt(String price_dt) {
	this.price_dt = price_dt;
}

public float getPrice() {
	return price;
}

public void setPrice(float price) {
	this.price = price;
}

public boolean isHasDiscount() {
	return hasDiscount;
}

public void setHasDiscount(boolean hasDiscount) {
	this.hasDiscount = hasDiscount;
}

public float getPrice_before_discount() {
	return price_before_discount;
}

public void setPrice_before_discount(float price_before_discount) {
	this.price_before_discount = price_before_discount;
}

public boolean isIn_stock() {
	return in_stock;
}

public void setIn_stock(boolean in_stock) {
	this.in_stock = in_stock;
}

public String getUrl() {
	return url;
}

public void setUrl(String url) {
	this.url = url;
}

public String getSite() {
	return site;
}

public void setSite(String site) {
	this.site = site;
}

public String getManufacturer() {
	return manufacturer;
}

public void setManufacturer(String manufacturer) {
	this.manufacturer = manufacturer;
}

public String getManufacturer_logo() {
	return manufacturer_logo;
}

public void setManufacturer_logo(String manufacturer_logo) {
	this.manufacturer_logo = manufacturer_logo;
}

@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", image=" + image + ", description=" + description + ", price_dt="
			+ price_dt + ", price=" + price + ", hasDiscount=" + hasDiscount + ", price_before_discount="
			+ price_before_discount + ", in_stock=" + in_stock + ", url=" + url + ", site=" + site + ", manufacturer="
			+ manufacturer + ", manufacturer_logo=" + manufacturer_logo + "]";
}


}
