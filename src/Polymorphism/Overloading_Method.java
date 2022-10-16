package Polymorphism;

public class Overloading_Method {

	public static void main(String[] args) {
		Overloading_Method om = new Overloading_Method();
		om.sum();
		om.sum(100);
		om.sum(1000, 2000);
        om.sum(200, 500, 700);
       om.sum(10, 20, 30, 40);
        
	}

	public void sum() {
		int a = 10;
		int b = 20;
		int sum=a+b;
		System.out.println("sum value is "+sum);
		
	}
	
	public void sum(int a) {
		int b=20;
		int sum= a+b;
		System.out.println("sum value is "+ sum);
	}
	
	public void sum(int a, int b) {
		int sum = a+b;
		System.out.println("sum value is "+sum);
	}
	public void sum( int z, int b, int c) {
	int a=20;
	int sum=a+b+c;
	System.out.println("sum value is "+sum);
	}
	public static void sum(int p, int q, int r, int s) {
		int sum = p+q+r+s;
		System.out.println("sum value is "+sum);
		
		
		
		
		
		
	}
}
