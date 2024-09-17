package org.BodyMassIndex;
import java.util.Scanner;
public class BodyMassIndexutil {
	BodyMassIndexFields a =new BodyMassIndexFields();
	Scanner sc=new Scanner(System.in);
	public void acceptrecord()
	{
		System.out.println("Enyter Your Height in meter: ");
		this.a.setHeight(sc.nextFloat());
		System.out.println("Enyter Your Weight In kg: ");
		this.a.setWeight(sc.nextInt());		
	}
	public void printrecord()
	{
	    a.solve();
		if(a.getBmi()<=18.4f)
		{
			System.out.println("you are Underweight and your Body to Mass ratio is: "+this.a.getBmi() );
		}
		if(a.getBmi()>=18.5f && a.getBmi()<=24.9f)
		{
			System.out.println("you are Normal and your Body to Mass ratio is: "+this.a.getBmi());
		}
		if(a.getBmi()>=25.0f && a.getBmi()<=29.9f)
		{
			System.out.println("you are Overweight and your Body to Mass ratio is:  "+this.a.getBmi());
		}
		if( a.getBmi()>30.0)
		{
			System.out.println("you are Obese and your Body to Mass ratio is: "+this.a.getBmi());
		}
	}
	public String toString() {
		return "Body to Mass Index height=" +this.a.getHeight() + ", weight=" +this.a.getWeight() + ", bmi=" +this.a.getBmi() ;
	}
}
