package com.matheusknaul.GameEngine.core;

import jakarta.persistence.Id;

@jakarta.persistence.Entity(name = "entities")
public abstract class Entity {
	
	@Id
	private Integer id;
	private String name;
}
