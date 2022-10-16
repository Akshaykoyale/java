package Polymorphism;

public class Overriding_Method extends Overloading_Method{

	public static void main(String[] args) {
		Overloading_Method om = new Overloading_Method();
		om.sum();
		
		Overriding_Method orm = new  Overriding_Method();
		orm.sum();
		orm.sum(50);
        orm.sum(10, 30, 500);
		
		
		
	}

	public void sum () {
		int a=20;
		int b=130;
		int sum =a+b;
		System.out.println("sum value is "+ sum);
		
	}
	
	
	
	
	
	
}
