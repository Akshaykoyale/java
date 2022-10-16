package methodStudy;

public class EmployeeDetails {

	public void employeedetails() {
		String Name;
		int Age;
		int JoiningYear;
		String MachineName;
		char Gender;
		
		Name="Akshay Koyale";
		Age=27;
		JoiningYear=2018;
		MachineName="CNC Operator";
		Gender='M';
		
		System.out.println("Employee Name is "+ Name);
		System.out.println("Employee Age is "+ Age);
		System.out.println("Employee Joining Year is "+ JoiningYear);
		System.out.println("Employee Post is "+ MachineName);
		System.out.println("Employee Gender is "+ Gender);
		
		
	}
	public void ED(String Name, int Age, int JoiningYear, String MachineName, char Gender) {
		System.out.println("=========================");
		System.out.println("Employee Name is "+ Name);
		System.out.println("Employee Age is "+ Age);
		System.out.println("Employee Joining Year is "+ JoiningYear);
		System.out.println("Employee Post is "+ MachineName);
		System.out.println("Employee Gender is "+ Gender);
		
	}
	}

