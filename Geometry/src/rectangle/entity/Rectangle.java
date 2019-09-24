package rectangle.entity;

public class Rectangle {
	private float length;
	private float width;
	
//	public Rectangle(float length, float width) {
//		this.length = length;
//		this.width = width;
//	}
	
//	public Rectangle() {
//    	
//	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		if (0.0f<=length && length<=20.0f)
		this.length = length;
		else {
			System.out.println("incorrect i/p");
		    System.exit(1);
		}
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		if (0.0f<=width && width<=20.0f)
		this.width = width;
		else {
			System.out.println("incorrect i/p");
		    System.exit(1);
		}
		
	}

		
	

}
