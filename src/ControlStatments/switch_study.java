package ControlStatments;

public class switch_study {
public static void main(String[] args) {
		/*  year 1 means 1st year
		 * year 2nd means 2nd year
		 * year 3rd means 3rd year
		 * year 4th means 4th year */
		int year=3;
		switch (year) {
		case 1:
			System.out.println("Welcome to 1st year");
			break;
          case 2:
			System.out.println("Welcome to 2nd year");
			break;
		case 3:
			System.out.println("Welcome to 3rd year");
			break;
		case 4:
			System.out.println("Welcome to 4th year ");
			break;
		default:
			System.out.println("Please enter value between 1 to 4");
			break;}
	/* Monday---> 1st day of week
	 * 
	 * Sunday----> 7th day of week */	
	 String day="Saturday";
	 switch(day) {
	 case "Monday": System.out.println("This is first day of week");
	 break;
	 case "Tuesday": System.out.println("This is 2nd day of week");
	 break;
	 case "Wensday": System.out.println("This is 3rd day of week");
	 break;
	 case "Thirsday": System.out.println("This is 4th day of week");
	 break;
	 case "Friday": System.out.println("This is 5th day of week");
	 break;
	 case "Saturday": System.out.println("This is 6th day of week");
	 break;
	 case "Sunday": System.out.println("This is 7th day of week");
	 break;
	 default : System.out.println("Please enter valid day in week");
	 break;
		  }
}}
