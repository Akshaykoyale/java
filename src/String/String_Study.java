package String;
public class String_Study {

	public static void main(String[] args) {
		String s = "velocity"; // without using new keyword --> Constant Pool Area
		String s1="velocity";
		String s2="vel";
        String s3 = "Test";

        String m = new String("velocity"); // using new keyword--> non-constant pool area
        String m1= new String("velocity");
		String m2= new String("VELOCITY");
		String m3= new String("");
		String m4= new String("Java Classes");

		System.out.println(s==s1);
		System.out.println(s.equals(s1));
        System.out.println(s==m);
        System.out.println(m.equals(m1));
        System.out.println(m==m1);
        System.out.println(s1.equals(m1));
        System.out.println("====================");
         
        System.out.println(m1.equalsIgnoreCase(m2));
        System.out.println(s1.toUpperCase());
		System.out.println(m2.toLowerCase());
		System.out.println(s2.length());
		System.out.println(m4.charAt(5));
		System.out.println("====================");
        
		System.out.println(s3.contains(""));
		System.out.println(m.isEmpty());
		System.out.println(m3.isEmpty());
		System.out.println(m2.charAt(7));
		System.out.println("====================");
        
        System.out.println(m2.endsWith("ITY"));
		System.out.println(m2.startsWith("VEL"));
		System.out.println(m2.substring(2));
		System.out.println(m2.substring(1,5));
		System.out.println(m1.concat(m4));
		s3=m1.concat(m4);
 		System.out.println(s3);
 		System.out.println("===================");
 		
 	System.out.println(s3.concat(" Pune"));
	System.out.println(s3);	
	s3=s3+" Software Testing";
    System.out.println(s3);
    System.out.println(s3.indexOf("v"));
	System.out.println(s3.lastIndexOf("e"));		
	System.out.println(m4.replace("java", "Manual"));
	String m5 = m4.replace("Java", "Manual");
	System.out.println(m4);
	System.out.println(m5);
	String m6= "My,test";
	System.out.println(m6);
	System.out.println(m6.split(","));
	


        
	}

}
