package com.fish.catalog.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.fish.catalog.model.Fish;
import com.fish.catalog.repository.FishRepository;

public class FishService {

	@Autowired
	private FishRepository fishRepository;

	public List<Fish> findAll() {

		List<Fish> fishes = new ArrayList<Fish>();
		for (Fish fish : fishRepository.findAll()) {
			fishes.add(fish);
		}

		return fishes;
	}

	public Long count() {
		return fishRepository.count();
	}

	public void deleteById(Long fishID) {
		fishRepository.deleteById(fishID);
	}
}
