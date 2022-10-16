package exceptionStudy;

public class UseOfFinally {

	public static void main(String[] args) 
	{
		int a=10;
		int b=2;
		
		
		try
		{
			int div=a/b;
			System.out.println(div);
		}
		
		finally
		{
			System.out.println("Finally print this");
		}
		System.out.println("Hi, good evening");
		//catch(ArithmeticException e)
		//{
		//	System.out.println("Divide by 0 is not possible");
		//}
		

	}

}
