package question4;

public class MoneyClient {
int j;
static int k;
	public static void main(String[] args) {
         Money obj1=new Money(100.00f,0.85f);
         float a=obj1.addition(5.00f,0.90f);
         System.out.println(a);
         k=8;
      
        // Money obj2=new Money(100.00f,0.25f);
         float b=obj1.subtraction(5.0f,0.25f);
        		 System.out.println(b);
         
         
	}
int addition() {
	this.j=5;
	k=8;
	return j;
}
}
