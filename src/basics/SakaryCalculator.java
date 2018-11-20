package basics;

public class SakaryCalculator {

	public static void main(String[] args) {
		// Let's create a variable to define our career
		
		// Declare a variable
		String career;
		System.out.println("Program is starting");
		
		// Define a variable
		career = "Software Developer";
		System.out.println("My career: " + career);
		
		// Declare & define
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		career = "Web Developer";
	
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("My salart as a " + career + " at the rate of $" + rate + " is $" + salary + " per year.");
		
		// Compute our annual salary
		// rate * hoursPerWeek * weeksPerYear
	}

}
