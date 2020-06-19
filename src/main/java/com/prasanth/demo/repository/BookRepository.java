package com.prasanth.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.prasanth.demo.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer>{

}
