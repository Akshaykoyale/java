package generalization;

public class Airtel implements TRAI{
	public static void main (String[]args) {
		Airtel A = new Airtel();
		A.call();
		A.message();
		A.data();
		A.method_A();
		System.out.println("===================");
		
		
	}

	@Override
	public void call() {
		System.out.println("Airtel call rate is 0.5p/s ");
		
	}

	@Override
	public void message() {
	 System.out.println("Airtel message is 100/day");
		
	}

	@Override
	public void data() {
		System.out.println("Airtel data is 1.5GB/day");
		
	}
	
	public void method_A () {
		System.out.println("Hi i am new method if Airtel");
	}
	
	
		
	

}
