package exceptionStudy;

public class StringIndexOutOfBound {

	public static void main(String[] args) throws InterruptedException 
	{
		String s =null;
		try 
		{
			System.out.println(s.charAt(10));
		} 
		catch (StringIndexOutOfBoundsException e) 
		{
			System.out.println("please enter correct index");
		}
		catch(NullPointerException e)
		{
			System.out.println("you are working null value");
		}
		  
		
		System.out.println("hi, hello");
		Thread.sleep(1000);


		

	}

}