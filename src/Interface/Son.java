package Interface;

public class Son implements Father, Mother{

	public static void main(String[] args) {
	Son s = new Son();
	s.money();
	s.house();
	s.love();
	s.cooking();
		
		

	}
     public void money(){
    	 System.out.println("Father have money");
     }
     public void house() {
    	 System.out.println("father have house");
     }
     public void love() {
    	 System.out.println("mother loves son");
     }
	public void cooking () {
		System.out.println("mother cooking is best");
	}
	
	
	
	
	
	
}
