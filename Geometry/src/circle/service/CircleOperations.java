package circle.service;

import circle.entity.Circle;

public class CircleOperations {

	public float circumference(Circle radius) {
		float circumference=(float)(2*3.14*radius.getRadius());
		return circumference;
		
	}
	
    public float arcLength(Circle circle) {
		float arclength=(float)(2*3.14*circle.getRadius()*circle.getAngle()/360);
		return arclength;
	}
}
