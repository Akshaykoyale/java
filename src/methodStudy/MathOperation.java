package methodStudy;

public class MathOperation {

	public static void main(String[] args) {
		MathOperation m = new MathOperation();
		m.addition();
		m.add(20, 30, 40);
	

	}
   public void addition() { // without parameter
	   int a;
	   int b;
	   int addition;
	   
	   a=10;
	   b=20;
	   addition=1020;
	   System.out.println("addition value is "+addition);	   
   }
   
   public void add(int a, int b, int c) { // with parameter
	   int addition = a+b+c;
	   System.out.println("addition value is "+ addition);
   }
	   
}   
   
