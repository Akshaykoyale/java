package exceptionStudy;

public class Test3 {

	public static void main(String[] args) 
	{
		String a="Pune";
		
		try 
		{
			System.out.println(a.charAt(-1));
		} 
		catch (Exception e)
		{
			System.out.println("Exception Ocured, Please Check Code");
		}
		
	}

}
