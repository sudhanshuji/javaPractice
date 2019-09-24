package rectangle.operations;

import rectangle.entity.Rectangle;

public class RectangleOperations {
      
	public float perimeter(Rectangle rectangle) {
		
		float perimeter=2*(rectangle.getLength()+rectangle.getWidth());
		return perimeter;
		
		}
	public float area(Rectangle rectangle) {
		float area=rectangle.getLength()*rectangle.getWidth();
		return area;
	}
}
