package methodStudy;


public class NonstaticRegularMethod {

	public static void main(String[] args) {
	
		NonstaticRegularMethod ak= new NonstaticRegularMethod();
		ak.demo();
		
		NonstaticRegularMethod1 ab= new NonstaticRegularMethod1();
		ab.demo1();
		
		NonstaticRegularMethod ac = new NonstaticRegularMethod();
		ac.demo2();
		
		NonstaticRegularMethod1 ad = new NonstaticRegularMethod1();
		ad.addition();
		
		NonstaticRegularMethod1 ae = new NonstaticRegularMethod1();
		ae.subtraction();
		
		NonstaticRegularMethod1 af = new NonstaticRegularMethod1();
		af.multiplication();
		
		NonstaticRegularMethod1 ag = new NonstaticRegularMethod1();
		ag.dividation();
		
		

	}

	public void demo() {
		System.out.println("this is a non static regular method");
		
	}
	public void demo2() {
		System.out.println(" I Love You Ak");
	}
}
