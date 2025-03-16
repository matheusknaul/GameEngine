package com.matheusknaul.GameEngine.components;

public class HealthComponent {
	private float totalLife;
	private float life;
	
	public HealthComponent(float life) {
		this.life = life;
	}
	
	public float getLife() {
		return this.life;
	}
	
	public float geTotaltLife() {
		return this.totalLife;
	}
	
	public void setTotalLife(float totalLife) {
		this.totalLife = totalLife;
	}
	
	public void setLife(float life) {
		this.life = life;
	}
	
	public void loseHealth(float rawDamage, float armor) {
		float damage = rawDamage - armor;
		setLife(getLife() - damage);
	}
	
	public void gainHealth(float cure) {
		setLife(getLife() + cure);
	}
	
}
