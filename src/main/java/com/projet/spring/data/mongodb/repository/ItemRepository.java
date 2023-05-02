package com.projet.spring.data.mongodb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.projet.spring.data.mongodb.model.Item;

public interface ItemRepository extends MongoRepository<Item, String> {
 
}
