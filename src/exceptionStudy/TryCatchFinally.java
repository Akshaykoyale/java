package exceptionStudy;

public class TryCatchFinally {

	public static void main(String[] args) 
	{
		String a="Akshay ";
		
		try 
		{
		   System.out.println(a.length());	
		} 
		
		catch (NullPointerException e) 
		{
			System.out.println("Please check null value, Should not be null");
		}
		
		finally 
		{
			System.out.println("Good evening");
		}
		
	}

}
