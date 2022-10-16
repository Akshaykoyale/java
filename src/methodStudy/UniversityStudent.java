package methodStudy;



public class UniversityStudent {

	public static void main(String[] args) {
		UniversityStudent S = new UniversityStudent();
		S.StudentInfo();
		S.StudentInfo("Akshay Koyale", "PU1024238", "Mechanical", 'M', 2016, 78.5f);
		
		
		}

  // Name, PRNNum, Branch, Department, Gender, Passout year, Weight
	public void StudentInfo() {
		String Name;
		Name="Akshay Koyale";
		
		String PRNNum;
		PRNNum="PU1024238";
		
		String Branch;
		Branch="Engineering";
				
		String Department;
		Department="Mechanical";
		
		char Gender;
		Gender='M';
		
		int Passoutyear;
		Passoutyear=2016;
		
		float Weight;
		Weight=78.5f;
		System.out.println("=========================");
		System.out.println("My Name Is "+ Name);
		System.out.println("My PRN Number is "+ PRNNum);
		System.out.println("My Branch is "+ Branch);
		System.out.println("My Department is "+ Department);
		System.out.println("My Gender is "+ Gender);
		System.out.println("My Passout year is "+ Passoutyear);
		System.out.println("My Weight is "+ Weight + " Kg");
		System.out.println("===============================");	
	}
	public void StudentInfo(String Name, String PRNNum, String Department, char Gender, int Passoutyear, float Weight) {
		System.out.println("=========================");
		System.out.println("My Name Is "+ Name);
		System.out.println("My PRN Number is "+ PRNNum);
		System.out.println("My Department is "+ Department);
		System.out.println("My Gender is "+ Gender);
		System.out.println("My Passout year is "+ Passoutyear);
		System.out.println("My Weight is "+ Weight + " Kg");
		System.out.println("===============================");
}


}
