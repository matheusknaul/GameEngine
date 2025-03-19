package components;

public class HealthComponent {
	
	private float totalLife;
	private float life;
	
	public HealthComponent() {
		this.totalLife = 0;
		this.life = 0;
	}
	
	public HealthComponent(float totalLife) {
		this.totalLife = totalLife;
		this.life = totalLife;
	}
	
	public HealthComponent(float totalLife, float life) {
		this.totalLife = totalLife;
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
