package com.fish.catalog.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fish.catalog.model.Fish;

@RestController
@RequestMapping("/api/catalog")
public class FishController {
	
	@GetMapping("fish/{id}")
	public ResponseEntity<Fish> read(@PathVariable("id") int id) {
	    Fish fish = new Fish();
	    
	    fish.setName("Betta Splends");
	    fish.setId(id);
	    fish.setCommonName("Betta");
	    
	    return new ResponseEntity<Fish>(fish,HttpStatus.OK);
	}
	

}
