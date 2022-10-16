package Casting_Study;

public class Primitive_Casting {

	public static void main(String[] args) {
 
// Implicit Casting:- Converting lower data type of info. into higher data type
		
		int a=10; // Lower Data Type
		System.out.println(a);
		
		double b=a;  // Higher Data Type
		System.out.println(b);
		System.out.println("===================");
		
// Explicit Casting:- Converting Higher data type of info. into lower data type
		
		double m =10.50; // Higher data type 
		System.out.println(m);
		
		int n = (int) m; // Lower Data type
		System.out.println(n);
		
// Boolean Casting:- Boolean casting is considered to be incompatible casting type,
		//because boolean data type is unique type of data type where information is
		//already pre-declared inside it.	
		
		
		
		

	}

}
