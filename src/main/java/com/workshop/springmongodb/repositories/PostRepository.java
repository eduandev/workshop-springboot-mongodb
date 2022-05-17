package com.workshop.springmongodb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.workshop.springmongodb.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
