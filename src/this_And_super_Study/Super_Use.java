package this_And_super_Study;

public class Super_Use extends this_Use {

	int a=50;

	public static void main(String[] args) {
		Super_Use SU = new Super_Use();
		SU.local();
		

		
		
		
	}
public void local() {
	int a=20;
	int a1=this.a;
	int a2=super.a;
	int a3=this.a*super.a;
	System.out.println("value of local variable from same class is "+a);
	System.out.println("value of global variable from same class is "+a1);
	System.out.println("value of global variable from super class is "+a2);
	System.out.println(super.b);
	System.out.println(a3);
	
	
}
	
	
	
	
	
	
}



