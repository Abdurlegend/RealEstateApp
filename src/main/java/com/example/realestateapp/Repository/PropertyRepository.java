package com.example.realestateapp.Repository;

import com.example.realestateapp.Entity.Property;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyRepository extends CrudRepository<Property, Long> {

}
