package RectangleClient;

import rectangle.entity.Rectangle;
import rectangle.operations.RectangleOperations;

public class RectangleClient {

	public static void main(String[] args) {
		   
		Rectangle obj1=new Rectangle();
		obj1.setLength(3.0f);
		obj1.setWidth(20.0f);
		RectangleOperations operation=new RectangleOperations();
		float area=operation.area(obj1);
		System.out.println("area of rectangle is "+area);
		float perimeter=operation.perimeter(obj1);
		System.out.println("perimeter of rectangle is "+perimeter);
		
		
	}

}
