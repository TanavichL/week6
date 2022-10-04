package com.example.week6.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.week6.pojo.Wizard;
@Repository
public interface WizardRepository extends MongoRepository<Wizard, String > {
    @Query(value = "{_id:'?0'}")
    public Wizard findByPeople(String id);
}
