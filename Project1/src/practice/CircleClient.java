package practice;

public class CircleClient {

	public static void main(String[] args) {

		Circle obj = new Circle();
		obj.setData(3.0f);
		float area = obj.calculateArea();
		System.out.println("area of circle is "+area);

	}

}
