package Casting_Study;

public class Son extends Father {
	
	public static void main(String[]args) {
		// Down Casting:-Assigning super class property into subclass 
		Son s = new Son();
		s.bike();
		s.mobile();
	s.bike();
	s.mobile();
	s.laptop();
		
		
	}
	
	
	
	public void mobile() {
		System.out.println("One plus");
	}
   public void bike() {
	   System.out.println("Shine");
   }
   public void laptop() {
	   System.out.println("HP");
   }
   
}
