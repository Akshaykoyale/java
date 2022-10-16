package String;

public class String_Methods {

	public static void main(String[] args) {
		String s = "akshay"; // without using new keyword
		String s1 = "akshay";
		String s2 = new String("akshay"); // with using new keyword
		String s3 = new String ("akshay");
		String s4 = new String ("AKSHAY");
		String s5 = new String("");
		
	// Use length method
		System.out.println(s.length());
        int mylength = s1.length();
        System.out.println(mylength);
        System.out.println("1===========================");
       // String s3 =null;
       //System.out.println(s3.length());
        
    // Use of toUpperCase & toLowerCase
        System.out.println(s.toUpperCase());
        System.out.println(s4.toLowerCase());
        String b = s2.toLowerCase();
        System.out.println(b);
        System.out.println("2===========================");
           
    //use of equals method;
        System.out.println(s==s1);
        System.out.println(s.equals(s1));
        System.out.println(s==s2);
        System.out.println(s.equals(s2));
        System.out.println(s2==s3);
        System.out.println(s2.equals(s3));
        System.out.println(s3.equalsIgnoreCase(s4));
        System.out.println("3==============================");
        
    // contains method used
        System.out.println(s.contains("akshay"));
        System.out.println("4===============================");
        
   // isEmpty method used   
        System.out.println(s.isEmpty());
        System.out.println(s5.isEmpty());
        boolean result = s5.isEmpty();
        System.out.println(result);
        System.out.println(s.isBlank());
        System.out.println(s5.isBlank());
        System.out.println("5================================");
        
   //charAt method use
        System.out.println(s.charAt(3));  
       char a = s.charAt(2);
       System.out.println(a);
       System.out.println("6==================================");
       
   // startsWith & endsWith  Use
       String y="India";
       System.out.println(y.startsWith("in"));
       System.out.println(y.startsWith("Ind"));
       System.out.println(y.startsWith("India"));
       System.out.println(y.startsWith("ia", 3));
       System.out.println(y.endsWith("a"));
       System.out.println(y.endsWith("ndia"));
       System.out.println("7============================");
       
    //substring method use
       String m="Maharashtra";
       System.out.println(m.substring(4));
       String str = m.substring(2);
       System.out.println(str);
       System.out.println(m.substring(0,4));
       System.out.println("8============================");
       
    //concat method use
       String a1="Gov Of ";
       String a2="India";
       System.out.println(a1.concat(a2));
       System.out.println(a1.concat("Maharashtra"));
       System.out.println("9============================");
       
    //indexOf method use
       String t="Tea";
       int index = t.indexOf('T');
       System.out.println(index);
       String t1="India is my country which is 2nd biggest";
       System.out.println(t1.indexOf('n'));
       System.out.println(t1.lastIndexOf('i'));
       System.out.println(t1.indexOf('i', 24));
       System.out.println("10============================");
     
     // replace method use  
       String k="testing";
       System.out.println(k.replace('t', 'o'));
       System.out.println(k.replace("ing", ""));
       System.out.println("=================================");
        
        
        
        
        
        
	}

}
