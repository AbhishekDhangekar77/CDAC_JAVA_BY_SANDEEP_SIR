


import java.util.Scanner;

// class
class Loan{
	//fields
	private float principal;
	private float interest;
	private float loan_term;
	private double monthlyPayment;
	private double amount_paid;
	
	public void takeInput() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Loan Amount :	");
		this.principal = scan.nextFloat();
		System.out.print("Enter the interest :	");
		this.interest = scan.nextFloat();
		System.out.print("Enter the loan term(in Years) :	");
		this.loan_term = scan.nextFloat();
		scan.close();
	}
	
	
	public void calculate() {
		
		// this.monthlyPayment = this.loan_amount * (this.interest * Math.pow((1 + this.interest),this.loan_term)) / (Math.pow((1 + this.interest),this.loan_term) - 1);
		float monthlyInterestRate = this.interest / 12 / 100;
		float numberOfMonths = this.loan_term * 12;
		this.monthlyPayment = this.principal * (monthlyInterestRate * Math.pow((1 + monthlyInterestRate),numberOfMonths)) / (Math.pow((1 + monthlyInterestRate),numberOfMonths) - 1);
		this.amount_paid = this.monthlyPayment * (this.loan_term * 12);
	}
	
	void displayOutput() {
		
		System.out.println("The Monthly Payment is :	" + this.monthlyPayment);
		
		System.out.println("Total amount paid over the life :	" + this.amount_paid );
		
	}
	
}

public class LoanAmortizationCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loan payment = new Loan();
		payment.takeInput();
		payment.calculate();
		payment.displayOutput();
	}

}

