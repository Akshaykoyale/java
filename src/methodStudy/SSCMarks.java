package methodStudy;

public class SSCMarks {

	public static void main(String[] args) {
	SSCMarks M = new SSCMarks();
	M.SubjectMarks();
	
	SSCMarks M1 = new SSCMarks();
	M1.SubjectMarks(89, 90, 81, 94, 98, 97);
	
	EmployeeDetails Ed = new EmployeeDetails();
	Ed.employeedetails();
	Ed.ED("Akash Parghane", 27, 2018, "CNC Operator", 'M');
	

	}
       // Subject:- Marathi, Hindi, English, Math, Science, History & Geography
	public static void SubjectMarks() { // without parameters
		int Marathi;
		Marathi=89;
		
		int Hindi;
		Hindi=90;
		
		int English;
		English=81;
		
		int Math;
		Math=94;
		
		int Science;
		Science=98;
		
		int HistoryGeography;
		HistoryGeography=97;
		System.out.println("My SSC Marks in Marathi is "+ Marathi + " Out of 100");
		System.out.println("My SSC Marks in Hindi is "+ Hindi + " Out of 100");
		System.out.println("My SSC Marks in English is "+ English + " Out of 100");
		System.out.println("My SSC Marks in Math is "+ Math + " Out of 100");
		System.out.println("My SSC Marks in Science is "+ Science + " Out of 100");
		System.out.println("My SSC Marks in History & Geography is "+ HistoryGeography + " Out of 100" );
		System.out.println("=========================");
		}
	public void SubjectMarks(int Marathi, int Hindi, int English, int Math, int Science, int HistoryGeography) { // with parameters
		System.out.println("My SSC Marks in Marathi is "+ Marathi + " Out of 100");
		System.out.println("My SSC Marks in Hindi is "+ Hindi + " Out of 100");
		System.out.println("My SSC Marks in English is "+ English + " Out of 100");
		System.out.println("My SSC Marks in Math is "+ Math + " Out of 100");
		System.out.println("My SSC Marks in Science is "+ Science + " Out of 100");
		System.out.println("My SSC Marks in History & Geography is "+ HistoryGeography + " Out of 100" );
		System.out.println("=========================");
		}
}
