package classandObjects;

public class MainCircle {

	public static void main(String[] args) {
		Chapter obj = new Chapter();
		float area = obj.calculateArea();
		System.out.println(area);

		Chapter obj1 = new Chapter(2.0f);

		area = obj1.calculateArea();
		System.out.println("area using parameterized constructor : " + area);
	}

}
