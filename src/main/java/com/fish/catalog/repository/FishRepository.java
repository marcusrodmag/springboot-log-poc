package com.fish.catalog.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.fish.catalog.model.Fish;

public interface FishRepository extends CrudRepository<Fish, Long> {
	
	  List<Fish> findByName(String name);

	  Fish findById(int id);

}
