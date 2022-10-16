package ControlStatments;

public class Nested_if_else_Study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String UN="Akshay";
		String PWD="123";
		
		if (UN=="Akshay") {
			
			System.out.println("Correct Username plz enter password ");
			
			if (PWD=="123") {
				
				System.out.println("Login successful");
				} 
			
			else  {
				System.out.println("Wrong password, plz check password");
               }
		 
		}
		else {
			System.out.println("Incorrect username, unable to login");

		}

	}
	

}
