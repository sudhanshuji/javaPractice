package circle.Client;

import circle.entity.Circle;
import circle.service.CircleOperations;

public class CircleClient {

	public static void main(String[] args) {
		   Circle obj = new Circle();
		   obj.setRadius(10.0f);
		   obj.setAngle(45.0f);
		   
		   CircleOperations result=new CircleOperations();
		   float circum=result.circumference(obj);
		   System.out.println("circumference of circle is "+circum);
		   float arc=result.arcLength(obj);
		   System.out.println("arclength of the circle is "+arc);

	}

}
