import java.util.Scanner;
public class DiscountCalculator {
	 double discountamount;
	    double originalPrice;
	    double discountRate;
	    double finalPrice;

	    void acceptRecord()
	    {    Scanner sc = new Scanner(System.in);
	        System.out.println("enter original price");
	        originalPrice = sc.nextDouble();
	        System.out.println("enter discount rate in percentage");
	        discountRate = sc.nextDouble();
	        sc.close();
	    }

	    void  discountRate()
	    {
	        double discountamount = originalPrice * (discountRate / 100);
	        finalPrice = originalPrice - discountamount;
	    }

	    void printRecord()
	    {
	        System.out.println("your discounted price is : " +finalPrice);
	    }

	    public static void main(String[] args)
	    {
	        DiscountCalculator ds  = new  DiscountCalculator();
	        ds.acceptRecord();
	        ds.discountRate();
	        ds.printRecord();
	        


	    }   
}
