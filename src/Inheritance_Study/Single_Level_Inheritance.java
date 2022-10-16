package Inheritance_Study;

public class Single_Level_Inheritance {

	public static void main(String[] args) {
		
		Mother m = new Mother();
		m.money();
		m.house();
		
		Son s = new Son();
		System.out.println("============");
		s.house();
		s.money();
		s.mobile();
		s.laptop();

	}

}
