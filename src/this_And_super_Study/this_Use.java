package this_And_super_Study;

public class this_Use {
	int a=1000;
	int b=200;
	

	public static void main(String[] args) {
	
		this_Use t = new this_Use();
		t.sum();
        t.multiplication();
	}
      public void sum() {
    	  int a=10;
    	  int b=20;
    	  int sum=a+b;
    	  System.out.println("sum value is "+sum);
    	  System.out.println(a);
    	  System.out.println(this.a);
    	  System.out.println(b);
    	  System.out.println(this.b);
	
}
	public void multiplication() {
		int a=5;
		int multiplication=this.a*a;
		System.out.println("multiplication value is "+multiplication);
		
		
	}
	
}
