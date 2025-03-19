package components;

import core.Component;

public class VelocityComponent extends Component{
	private float vx, vy;
	
	public VelocityComponent(float vx, float vy) {
		this.vx = vx;
		this.vy = vy;
	}

	public float getVx() {
		return vx;
	}
	
	public float getVy() {
		return vy;
	}

	public void setVx(float vx) {
		this.vx = vx;
	}

	public void setVy(float vy) {
		this.vy = vy;
	}
	
	
}
