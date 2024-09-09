import java.util.Scanner;
public class CompoundInterestCalculator {
	 private double principal;
	    private double annualInterestRate;
	    private int numberOfCompounds;
	    private int years;

	    
	    public void acceptRecord() {
	        Scanner scanner = new Scanner(System.in);

	       
	        System.out.print("Enter the initial investment amount : ");
	        principal = scanner.nextDouble();

	        
	        System.out.print("Enter the annual interest rate (as a percentage): ");
	        annualInterestRate = scanner.nextDouble() / 100; 
	       
	        System.out.print("Enter the number of times interest is compounded per year: ");
	        numberOfCompounds = scanner.nextInt();

	        
	        System.out.print("Enter the investment duration in years: ");
	        years = scanner.nextInt();
	        scanner.close();
	    }

	   
	    public double calculateFutureValue() {
	        
	        return principal * Math.pow(1 + (annualInterestRate / numberOfCompounds), numberOfCompounds * years);
	    }

	   
	    public double calculateTotalInterest(double futureValue) {
	        return futureValue - principal;
	    }

	   
	    public void printRecord(double futureValue, double totalInterest) {
	        System.out.printf("Future Value of Investment: %.2f%n", futureValue);
	        System.out.printf("Total Interest Earned: %.2f%n", totalInterest);
	    }

	  
	    public static void main(String[] args) {
	       
	        CompoundInterestCalculator calculator = new CompoundInterestCalculator();

	     	        calculator.acceptRecord();
	      	        double futureValue = calculator.calculateFutureValue();
	      	        double totalInterest = calculator.calculateTotalInterest(futureValue);
	   	        calculator.printRecord(futureValue, totalInterest);
	    }
}
