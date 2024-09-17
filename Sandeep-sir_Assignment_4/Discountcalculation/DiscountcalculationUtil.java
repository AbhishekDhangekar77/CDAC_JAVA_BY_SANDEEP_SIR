package org.Discountcalculation;
import java.util.Scanner;
public class DiscountcalculationUtil {
	DiscountcalculationFields DCF =new DiscountcalculationFields();
	Scanner sc= new Scanner (System.in);
	public void acceptrecord() {
		System.out.print("Enter The Original Price:");
		this.DCF.setOriginal_price(sc.nextInt());
		System.out.print("Enter The Discount Rate :");
		this.DCF.setDiscount_rate(sc.nextFloat());
		
	}
	public void printrecord()
	{
		DCF.calculatediscount();
		System.out.println("The Final Amount is: "+this.DCF.getFinal_amount());	
		System.out.println("The Discount Amount is: "+this.DCF.getDiscount_amount());	
	}

	public String toString() {
		return "The final Amount is: "+this.DCF.getFinal_amount()+" The Discount Amount is: "+this.DCF.getDiscount_amount();
	}
}
