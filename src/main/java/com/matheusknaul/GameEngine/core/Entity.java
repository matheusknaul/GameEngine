package com.matheusknaul.GameEngine.core;

import com.matheusknaul.GameEngine.components.HealthComponent;

import jakarta.persistence.Id;

@jakarta.persistence.Entity(name = "entities")
public abstract class Entity {
	
	@Id
	private Integer id;
	private String name;
	
	private HealthComponent hp;
	
	public Entity() {
		super();
	}
	
	public Entity(Integer id, String name) {
		this.id = id;
		this.name = name;
		this.hp = new HealthComponent(0);
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public HealthComponent getHp() {
		return this.hp;
	}
	
	public void setHp(float totalLife, float life) {
		this.hp = new HealthComponent(totalLife, life);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
