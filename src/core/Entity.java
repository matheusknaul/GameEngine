package core;

import java.awt.image.BufferedImage;

import components.HealthComponent;


public abstract class Entity {
	
	private Integer id;
	private String name;
	
	private HealthComponent hp;
	
	public int x, y;
	public int speed;
	
	public Entity() {
		super();
	}
	
	public Entity(Integer id, String name) {
		this.id = id;
		this.name = name;
		this.hp = new HealthComponent(0);
	}
	
	public BufferedImage front1, front2, front3, left1, left2, left3, right1, right2, right3, back1, back2, back3;
	
	public int spriteCounter = 0;
	public int spriteNum = 1;
	
	public String direction;
	
	
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
