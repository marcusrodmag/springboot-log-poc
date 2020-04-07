package com.fish.catalog.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import com.fish.catalog.model.Fish;
import com.fish.catalog.repository.FishRepository;

@RestController
@RequestMapping("/api/catalog")
public class FishController {
	
	@Autowired
	FishRepository fishRepository; 
	
	private static final Logger log = LoggerFactory.getLogger(FishController.class);
	
	@GetMapping("fish/{id}")
	public ResponseEntity<Fish> read(@PathVariable("id") int id) {
		Fish fish = fishRepository.findById(id);
		
//	    log.info(fish.toString());
	    return new ResponseEntity<Fish>(fish,HttpStatus.OK);
	}
	
	
	@GetMapping("fish/create")
	public ResponseEntity<String> populate() {
		
		Fish fish1 = new Fish(1, "Betta splends", "Betta");
		log.info("Adicionando: " + fish1.toString());
		fishRepository.save(fish1);
		
		Fish fish2 = new Fish(2, "Brachygobius xanthozona", "Abelhinha");
		log.info("Adicionando: " + fish2.toString());
		fishRepository.save(fish2);
		
		Fish fish3 = new Fish(3, "Chromobotia macracanthus", "Bória Palhaço");
		log.info("Adicionando: " + fish3.toString());
		fishRepository.save(fish3);
		
		Fish fish4 = new Fish(4, "Corydoras nattereri", "Coridora");
		log.info("Adicionando: " + fish4.toString());
		fishRepository.save(fish4);
		
		Fish fish5 = new Fish(5, "Paracheirodon axelrodi", "Neon");
		log.info("Adicionando: " + fish5.toString());
		fishRepository.save(fish5);
		
		Fish fish6 = new Fish(6, "Pterophyllum scalare", "Acará Bandeira");
		log.info("Adicionando: " + fish6.toString());
		fishRepository.save(fish6);
		
	    return new ResponseEntity<String>("Catalogo de peixes criado com sucesso",HttpStatus.OK);
	}
	

}
