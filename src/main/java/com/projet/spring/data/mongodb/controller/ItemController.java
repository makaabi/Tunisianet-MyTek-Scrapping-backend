package com.projet.spring.data.mongodb.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.projet.spring.data.mongodb.model.Item;
import com.projet.spring.data.mongodb.repository.ItemRepository;


@RestController
@RequestMapping("/api")
public class ItemController {



  @Autowired
  ItemRepository itemRepository;
  @GetMapping("/testing")
  public String testing() {
      return "testing";

  }
  
  
  @GetMapping("/test/{query}")
  public String testing(@PathVariable("query") String query) {
      return query;

  }
  
  
  @GetMapping("/tunisianet")
  public Item getTunisianetQuery(@RequestParam("page") String query,@RequestParam("page") String page,@RequestParam("price") String pricerange) {
	  String uri = "http://localhost:9300/search/tunisianet?query="+query+"&page="+page+"&price="+pricerange;	 
	  RestTemplate restTemplate = new RestTemplate();
	  Item item = restTemplate.getForObject(uri, Item.class);
	  createItem(item);
      return item;

  }

  
  @GetMapping("/mytek")
  public Item getMytekQuery(@RequestParam("page") String query,@RequestParam("page") String page,@RequestParam("price") String pricerange) {
	  String uri = "http://localhost:9300/search/mytek?query="+query+"&page="+page+"&price="+pricerange;	
	  RestTemplate restTemplate = new RestTemplate();
	  Item item = restTemplate.getForObject(uri, Item.class);
	  createItem(item);
      return item;

  }

  
  
  
  
  @GetMapping("/items")
  public ResponseEntity<List<Item>> getAllItems() {
    try {
      List<Item> items = new ArrayList<Item>();

      itemRepository.findAll().forEach(items::add);
     

      if (items.isEmpty()) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      }

      return new ResponseEntity<>(items, HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  @GetMapping("/items/{id}")
  public ResponseEntity<Item> getItemById(@PathVariable("id") String id) {
    Optional<Item> ItemData = itemRepository.findById(id);

    if (ItemData.isPresent()) {
      return new ResponseEntity<>(ItemData.get(), HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

  @PostMapping("/items")
  public ResponseEntity<Item> createItem(@RequestBody Item item) {
    try {
    	Item _item = itemRepository.save(item);
      return new ResponseEntity<>(_item, HttpStatus.CREATED);
    } catch (Exception e) {
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

 

  @DeleteMapping("/items/{id}")
  public ResponseEntity<HttpStatus> deleteItem(@PathVariable("id") String id) {
    try {
    	itemRepository.deleteById(id);
      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    } catch (Exception e) {
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  @DeleteMapping("/items")
  public ResponseEntity<HttpStatus> deleteAllItems() {
    try {
    	itemRepository.deleteAll();
      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    } catch (Exception e) {
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

 
}
