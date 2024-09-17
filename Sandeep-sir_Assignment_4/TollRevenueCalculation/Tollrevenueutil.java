package org.TollRevenueCalculation;
import java.util.Scanner;

public class Tollrevenueutil {
	
	Scanner sc =new Scanner (System.in);
	int a;
	TollRevenueFields TRF =new TollRevenueFields();
	public void setTollRates()
	{
			System.out.println("Do you Want to Enter The New Toll Prices ? \n1.Yes\n2.No");
			int a=(sc.nextInt());
			if(a==1)
			{
			System.out.println("Enter Toll Rate For Car:");
			TRF.setCar_rate(sc.nextInt());
			System.out.println("Enter Toll Rate For Truck:");
			TRF.setTruck_rate(sc.nextInt());
			System.out.println("Enter Toll Rate For Motorcycle:");
			TRF.setMotorcycle_rate(sc.nextInt());
			}
}
	public void accept_record()
	{
		do {		
		System.out.println("Select Your Vehicle Type:\n1.Car\n2.Truck\n3.Motorcycle");
		TRF.addvehical(sc.nextInt());
		System.out.println("Do you Want to add vehicle ? \n1.Yes\n2.No");
		a =sc.nextInt();
		} while (a!=2);
	}
	public void printRecord()
	{
		TRF.calculateRevenue();
		System.out.println("Car        : "+TRF.getC_count()+" x "+TRF.getCar_rate()+"  = "+TRF.getC_sum());
		System.out.println("Truck 	   : "+TRF.getT_count()+" x "+TRF.getTruck_rate()+" = "+TRF.getT_sum());
		System.out.println("MotorCycle : "+TRF.getM_count()+" x "+TRF.getMotorcycle_rate()+"  = "+TRF.getM_sum());
		System.out.println("------------------------------");
		System.out.println("Total Revenu: "+TRF.getTotal());
		System.out.println("Total vehicles: "+(int)(TRF.getM_count()+TRF.getC_count()+TRF.getT_count()));
		String str=TRF.toString();
		System.out.println("\n\n"+str);
	}
	public int menu()
	{
		System.out.println("Exit         0");
		System.out.println("Set Rates    1");
		System.out.println("Accept value 2");
		System.out.println("Print Value  3");
		int ch=sc.nextInt();
		return ch;
	}
	

}