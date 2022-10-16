package accessSpecifier;

public class PrivateUse {

	public static void main(String[] args) {
		
		PrivateUse PU = new PrivateUse();
		PU.test1();
		PU.test2();
		PU.test3();
		PU.test4();
		

	}
       public void test1() {
	System.out.println("Public test1 method");
}
	private void test2() {
		System.out.println("private test2 method");
	}
	void test3() {
		System.out.println("default test3 method");
	}
	protected void test4() {
		System.out.println("protected test4 method");
		
	}
	
}
