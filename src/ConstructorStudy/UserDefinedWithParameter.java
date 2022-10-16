package ConstructorStudy;

public class UserDefinedWithParameter {
	int a;
	int b;
	int c;
	
	public UserDefinedWithParameter() { // User defined without parameter
		a=20;
		b=30;
		c=50;
}
	public UserDefinedWithParameter(int x) { // User defined with single parameter
		a=x;
	}
	public UserDefinedWithParameter(int x, int y) { // User defined with two parameters
		a=x;
		b=y;
	}
	public UserDefinedWithParameter(int x, int y, int z) { // user defined with three parameters
		a=x;
		b=y;
		c=z;
		
	}

	public static void main(String[] args) {
		UserDefinedWithParameter UDP = new UserDefinedWithParameter();
		UDP.add();
		
		UserDefinedWithParameter UDP1 = new UserDefinedWithParameter(200);
		UDP1.add();
		
		UserDefinedWithParameter UDP2 = new UserDefinedWithParameter(200, 300);
		UDP2.add();
		
		UserDefinedWithParameter UDP3 = new UserDefinedWithParameter(200, 300, 500);
		UDP3.add();
		
	}
 public void add() {
	 int add=a+b+c;
	 System.out.println("Addition value is "+ add);
 }
}
