package ControlStatments;

public class else_if_study {

	public static void main(String[] args) {
		//   If marks is >65 then it is first class with distingtion
		//  If marks is 60 to 65 then it is 1st class
		//  If marks is 50 to 59  then it is 2nd class
		// If marks is 40 to 49 it is just a pass
		int marks=32;
		
		if (marks>65) {
		System.out.println("You are in 1st class with dist");
			}
		else if (marks>=60) {
			System.out.println("You got 1st class");
		}
		else if (marks>=50) {
			System.out.println("You got 2nd class");
		}
		else if (marks>=40) {
			System.out.println("You are just pass");
		}
		else {
			System.out.println("You are fail");
		}
		System.out.println("=============");
/* If it is summer season---> Temperature is above 40°c
 *  If it is rainy season---> Rainfall is high
 *  If it is winter season---> Weather is very cold */
  String season= "Summer";
  if (season=="Summer") {
	  System.out.println("Temperature is above 40°c");
	   }
  else if (season=="rainy") {
	  System.out.println("Rainfall is high");
  }
  else if (season=="winter") {
	  System.out.println("Weather is very cold");
  }
  else {
		System.out.println("please enter correct weather condition");
	}
}
}