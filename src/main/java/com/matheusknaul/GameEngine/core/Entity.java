package com.matheusknaul.GameEngine.core;

import com.matheusknaul.GameEngine.components.HealthComponent;

import jakarta.persistence.Id;

@jakarta.persistence.Entity(name = "entities")
public abstract class Entity {
	
	@Id
	private Integer id;
	private String name;
	
	private HealthComponent hp;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
