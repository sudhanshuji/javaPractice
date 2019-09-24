package classandObjects;

public class Chapter {
	float radius;

	Chapter() {
		radius = 3.0f;
	}
	
	Chapter(float radius){
		this.radius = radius;
	}

	float calculateArea() {
		float area = (float) (3.14 * radius * radius);
		return (area);
	}

}
