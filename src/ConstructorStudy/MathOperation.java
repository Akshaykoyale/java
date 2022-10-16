package ConstructorStudy;

public class MathOperation {

	int a;
	int b;
	
	public MathOperation() { // User defined constructor without parameters
	
		a=100;
		b=150;
}
	public static void main(String[] args) {
		MathOperation MO = new MathOperation();
		MO.add();
		
		MathOperation MO1 = new MathOperation();
		MO1.sub();

	}
	public void add() {
		int add=a+b;
		System.out.println("Sum Value is "+ add);
	}
	
	public void sub() {
		int sub=a-b;
		System.out.println("sub value is "+ sub);
		
	}
}
