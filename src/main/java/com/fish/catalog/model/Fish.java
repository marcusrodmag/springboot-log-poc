package com.fish.catalog.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Fish {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String name;
	
	private String commonName;
	
	
	  @Override
	  public String toString() {
	    return String.format(
	        "Fish[id=%d, Name='%s', Common Name='%s']",
	        id, name, commonName);
	  }

}
