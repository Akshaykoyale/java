package Abstract_Study;

public class Concrete_Class extends Abstract_Class {

	public static void main(String[] args) {
Concrete_Class CC = new Concrete_Class();
CC.test1();
CC.test2();
CC.test3();


	}
public void test3() {
	System.out.println("Hi i am incomplete method test3 from abstract class");
}
}
