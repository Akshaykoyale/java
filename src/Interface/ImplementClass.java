package Interface;

public class ImplementClass implements Interface_Study {

	public static void main(String[] args) {
		System.out.println(a);
		
		ImplementClass IC =new ImplementClass();
		IC.test();
		IC.test1();
		IC.test2();
			

	}
	public void test() {
		System.out.println("method test implement in ImplementClass");
	}
	
	public void test1() {
		System.out.println("method test1 implement in ImplementClass");
		
	}
	public void test2() {
		System.out.println("Hi i am test 2");
	}

}
