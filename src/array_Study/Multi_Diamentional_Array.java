package array_Study;

public class Multi_Diamentional_Array {

	public static void main(String[] args) {
      
		// 1. Array declaration
		int a[][]= new int [2][2];  // Array declaration using new keyword
		
		//2. Array initialisation
		a[0][0]= 1;
		a[0][1]= 2;
		a[1][0]= 3;
		a[1][1]= 4;
		
		// 3. Usages
		System.out.print(a[0][0]+" ");
		System.out.println(a[0][1]);
		System.out.print(a[1][0]+" ");
		System.out.println(a[1][1]);
		System.out.println("============================");
		
		for (int i=0; i<=1; i++) {
			for (int j=0; j<=a.length-1; j++) {
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();}
			System.out.println("=======================");
			
			
		int b[][]= {{1,2},{3,4}, {5,6}, {7,8}, {9,10}}; // Array declaration without new keyword
		for (int i=0; i<=b.length-1; i++) {
			for (int j=0; j<=1; j++) {
				System.out.print(b[i][j]+ " ");
			}
			System.out.println();}
			System.out.println("=============================");
		
			char c[][]={{'A','B','C'},{'M', 'N','O'},{'X', 'Y', 'Z'} };
			for(int i=0; i<=c.length-1; i++) {
				for(int j=0; j<=2; j++) {
					System.out.print(c[i][j]+" ");
				}System.out.println();}
				System.out.println("=============================");
				
				
				String d[][]={{"Akshay","Bankatrao","Koyale"},{"Abhijit","Bankatrao","Koyale"}};
				for(int i=0; i<=d.length-1; i++) {
					for(int j=0; j<=2; j++) {
						System.out.print(d[i][j]+" ");
					}System.out.println();}
					System.out.println("=============================");
				
				
				
				
			}
			
			
		}


