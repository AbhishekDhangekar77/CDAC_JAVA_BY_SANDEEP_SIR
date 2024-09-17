package org.Discountcalculation;

public class Discountcalculation {

	public static void main(String[] args) {
		DiscountcalculationUtil DCU =new DiscountcalculationUtil();
		DiscountcalculationFields DCF =new DiscountcalculationFields();
		DCU.acceptrecord();
		DCF.calculatediscount();
		DCU.printrecord();	
		String str = DCU.toString();
		System.out.println(str);

	}
}
