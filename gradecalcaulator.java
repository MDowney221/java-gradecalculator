package gradecalculator;
import java.util.Scanner;

public class gradecalcaulator {
	//Takes user's input and calculates a letter grade
	
	public static void main(String[] args) {
			
		//Declare the variables for the program
		Scanner in = new Scanner(System.in);
		String firstName;
		String lastName;
		Double studentPoints;
		Double totalPercentage;
		String finalGrade;
		final Double TOTALPOINTS = 1000.0;
		String calculateAgain = "y";
		
		//Gets the user's info
		System.out.println("This program will collect information on a user and calcaultes their grade");
		System.out.print("Please enter your first name: ");
		firstName = in.nextLine();
		System.out.print("Please enter your last name: ");
		lastName = in.nextLine();
		System.out.print("Please enter your total points: ");
		studentPoints = in.nextDouble();
		
		totalPercentage = studentPoints / TOTALPOINTS;
		
		//Calculates the letter grade based on totalPercentage
		if (totalPercentage >= 0.9) 
			{
			finalGrade = "A";
			} 
		else if (totalPercentage >= 0.8) 
			{
			finalGrade = "B";
			} 
		else if (totalPercentage >= 0.7) 
			{
			finalGrade = "C";
			}
		else if (totalPercentage >= 0.6) 
			{
			finalGrade = "D";
			}
		else if (totalPercentage >= 0) 
			{
			finalGrade = "F";
			}
		else 
			{
			finalGrade = "This is not a valid grade";
			}
		
		if (totalPercentage >= 0 && totalPercentage <=1.0) 
			{
			System.out.println(firstName + " " + lastName + " " + "earned " + studentPoints + " points, which is " + totalPercentage + " and a letter grade of " + finalGrade);
			System.out.println("All information for this user has been calcaulated. Please run the program again to calcaulate another grade.");
			}
		else
			{
			System.out.println("This is not a valid grade. Please run the program again to calculate a grade.");
			}
		

	}

}
/*
if (testscore >= 90) {
    grade = 'A';
} else if (testscore >= 80) {
    grade = 'B';
} else if (testscore >= 70) {
    grade = 'C';
} else if (testscore >= 60) {
    grade = 'D';
} else {
    grade = 'F';
}
System.out.println("Grade = " + grade);
}
*/