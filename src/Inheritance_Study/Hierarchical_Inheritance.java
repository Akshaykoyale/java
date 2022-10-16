package Inheritance_Study;

public class Hierarchical_Inheritance {

	public static void main(String[] args) {
		
		Daughter D = new Daughter();
		D.house();
		D.money();
		D.Jewlery();
		D.dress();
		D.love();
		D.recipe();
		
		
		System.out.println("================");
        Son S = new Son();
        S.love();
        S.recipe();
        S.money();
        S.house();
        S.laptop();
        S.mobile();
	}

}
