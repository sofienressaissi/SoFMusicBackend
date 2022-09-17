package com.sofmusic.main.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sofmusic.main.entities.Release;
import org.springframework.stereotype.Repository;

@Repository
public interface ReleaseRepository extends MongoRepository<Release, String> {
    
}
