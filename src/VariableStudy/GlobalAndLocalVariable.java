package VariableStudy;

public class GlobalAndLocalVariable {
	int a=90;
	
	static int b=100;
	
	public static void main(String[] args) {
	
		GlobalAndLocalVariable GBV = new GlobalAndLocalVariable();
		GBV.test();
		test1();
		System.out.println("the value of global variable a is "+ GBV.a);
		System.out.println("the value of b is "+ b);
		
		int sum = 100+GBV.a;
		System.out.println("Sum value is "+sum);
		int sub=150-b;
		System.out.println("value of sub is "+sub);
		sample s = new sample();
		System.out.println("the value of non static variable from another class is "+ s.p);
		System.out.println("the value of static variable from another class is "+sample.q);
	}
	
	public void test()
	{
	int a=80;// local variable
	int sum=a+100;
	System.out.println("Sum is "+sum);
	}
	public static void test1() {
		int a=1000;
	System.out.println("Running static method value is " + a );
	}
}
