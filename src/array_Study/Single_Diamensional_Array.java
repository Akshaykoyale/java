package array_Study;

public class Single_Diamensional_Array {

	public static void main(String[] args) {
		int rollnum[]= {10,20,30,40,50};
		System.out.println(rollnum[3]);
		System.out.println("Orignal Output");
		for (int i=0;i<=4;i++)
		{
			System.out.println(rollnum[i]);
			
		}System.out.println("================");

		System.out.println("Sorted array");
		for (int i=0;i<=4;i++)
		{
			System.out.println(rollnum[i]);
		}
		System.out.println("=======================");
		
		for (int i=0; i<=rollnum.length-1; i++) {
			System.out.println(rollnum[i]);
		}
		System.out.println("=======================");
	
	System.out.println("Descending order");
	for (int i=4;i>=0;i--)
	{
		System.out.println(rollnum[i]);
	}
	System.out.println("=======================");
	
	
	for (int i=rollnum.length-1; i>=0; i--) {
		System.out.println(rollnum[i]);
		
	}
	}


}
