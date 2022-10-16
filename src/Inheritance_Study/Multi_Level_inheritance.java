package Inheritance_Study;

public class Multi_Level_inheritance {

	public static void main(String[] args) {
		Grandmother GM = new Grandmother();
		GM.recipe();
		GM.love();
		
		System.out.println("===========");
       Mother M = new Mother();
       M.love();
       M.recipe();
       M.money();
       M.house();
       
       System.out.println("===========");
       Son S = new Son();
       S.love();
       S.recipe();
       S.money();
       S.house();
       S.laptop();
       S.mobile();
       
	}

}


