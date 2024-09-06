

	/* •Code: 
		Underweight: BMI less than 18.5
	•	Normal weight: BMI of 18.5 to 24.9
	•	Overweight: BMI of 25 to 29.9
	•	Obesity: BMI of 30 or higher
	 */


	import java.util.Scanner;

public class BMI {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your weight in kg: ");
		float w = sc.nextFloat();
		System.out.println("Enter your weight in metre: ");
		float h = sc.nextFloat();
		sc.close();
		
		float bmi = w/(h*h);
		
		if(bmi > 25) {
			System.out.println("You are overweight");
		} else if (bmi > 18.5) {
			System.out.println("You are normal weight");
		} else {
			System.out.println("You are underweight");
		}
	}
}

