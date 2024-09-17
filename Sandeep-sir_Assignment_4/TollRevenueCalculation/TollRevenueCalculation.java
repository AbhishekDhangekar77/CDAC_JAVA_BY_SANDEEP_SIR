package org.TollRevenueCalculation;

public class TollRevenueCalculation {
	public static void main(String[] args) {
		Tollrevenueutil w =new Tollrevenueutil();
		TollRevenueFields Q =new TollRevenueFields();
		int ch=w.menu();
		while(ch!=0)
		{
			switch (ch) {
			case 1:
				w.setTollRates();
				
			case 2:
				w.accept_record();
				
			case 3:
				Q.calculateRevenue();
				
			case 4:
				w.printRecord();
				break;
			default:
				break;
			}
		}
		
		
	}
}
