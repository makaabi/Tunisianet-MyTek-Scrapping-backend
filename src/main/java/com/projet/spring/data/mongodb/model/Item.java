package com.projet.spring.data.mongodb.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "data")
public class Item {
  @Id
  private String id;

  private String site;
  private String url;
  private int total_items;
  private int items_shown;
  private int current_page;
  private int total_pages;
  private ArrayList<Product> product = new ArrayList<Product>();



  public Item() {

  }



public Item(String id, String site, String url, int total_items, int items_shown, int current_page, int total_pages,
		ArrayList<Product> product) {
	super();
	this.id = id;
	this.site = site;
	this.url = url;
	this.total_items = total_items;
	this.items_shown = items_shown;
	this.current_page = current_page;
	this.total_pages = total_pages;
	this.product = product;
}



public String getId() {
	return id;
}



public void setId(String id) {
	this.id = id;
}



public String getSite() {
	return site;
}



public void setSite(String site) {
	this.site = site;
}



public String getUrl() {
	return url;
}



public void setUrl(String url) {
	this.url = url;
}



public int getTotal_items() {
	return total_items;
}



public void setTotal_items(int total_items) {
	this.total_items = total_items;
}



public int getItems_shown() {
	return items_shown;
}



public void setItems_shown(int items_shown) {
	this.items_shown = items_shown;
}



public int getCurrent_page() {
	return current_page;
}



public void setCurrent_page(int current_page) {
	this.current_page = current_page;
}



public int getTotal_pages() {
	return total_pages;
}



public void setTotal_pages(int total_pages) {
	this.total_pages = total_pages;
}



public ArrayList<Product> getProduct() {
	return product;
}



public void setProduct(ArrayList<Product> product) {
	this.product = product;
}



@Override
public String toString() {
	return "Item [id=" + id + ", site=" + site + ", url=" + url + ", total_items=" + total_items + ", items_shown="
			+ items_shown + ", current_page=" + current_page + ", total_pages=" + total_pages + ", product=" + product
			+ "]";
}
  
  


}
