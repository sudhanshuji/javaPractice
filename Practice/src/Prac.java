import java.util.Scanner;

public class Prac {

	public static void main(String[] args) {
       System.out.println("type your name ");
       Scanner h= new Scanner(System.in);
      String name = h.nextLine();
      System.out.println("hello "+ name);
      
      System.out.println("enter your age ");
      int age=h.nextInt();
      System.out.println("my age is "+age);
      
	}

}
