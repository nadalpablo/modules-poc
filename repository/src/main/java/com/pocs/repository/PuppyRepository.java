package com.pocs.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.pocs.model.Puppy;

@Repository
public interface PuppyRepository extends MongoRepository<Puppy, String> {

}
