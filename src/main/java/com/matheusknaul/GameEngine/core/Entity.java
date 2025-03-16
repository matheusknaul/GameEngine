package com.matheusknaul.GameEngine.core;

import com.matheusknaul.GameEngine.annotations.Id;

@com.matheusknaul.GameEngine.annotations.Entity(tableName = "entities")
public abstract class Entity {
	
	@Id
	private Integer id;
	private String name;
}
