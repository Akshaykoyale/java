package exceptionStudy;

public class Test2 {

	public static void main(String[] args) 
	{
		int a=10;
		int b=0;
		try
		{
			int div=a/b;
			System.out.println(div);
		} 
		catch (ArithmeticException e) 
		{
			System.out.println("B value should not be 0");
		}
		
		System.out.println("HI");
		

	}

}
