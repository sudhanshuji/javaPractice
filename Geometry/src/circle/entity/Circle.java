package circle.entity;

public class Circle {

	float radius;
	float angle;
	
	public Circle(float radius, float angle) {
		this.radius = radius;
		this.angle = angle;
	}
	
	public Circle() {
		
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public float getAngle() {
		return angle;
	}

	public void setAngle(float angle) {
		this.angle = angle;
	}
	
	
}
