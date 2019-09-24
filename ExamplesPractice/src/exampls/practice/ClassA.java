package exampls.practice;

class A {

	int i=0;
	void doOverride(int k) {
		i=k;
	}
}
class B extends A{
	
	void doOverride(int k) {
		i=2*k;
		System.out.println("the value is : "+i);
	}
	
	public static void main(String[] args) {
	
		B b=new B();
		b.doOverride(12);

	}

}
