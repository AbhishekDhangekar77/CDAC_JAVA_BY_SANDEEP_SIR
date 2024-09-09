import java.util.Scanner;
public class BMITracker {
	 
    double weight;
    double height;
    double BMI;

    void acceptRecord()
    {
     Scanner sc = new Scanner(System.in );
     System.out.println("enter weight");
     weight = sc.nextDouble();
     System.out.println("enter height");
     height = sc.nextDouble();
    sc.close();

    }
    void calculateBMI()
    {
         BMI = weight / (height * height);
    }
    String  classifyBMI() 
    {
    if(BMI < 18.5)
    {
       return "underweight";
    }
    else if( 18.5 <= BMI && BMI< 24.9)
    {
       return "normal weight"; 
    }
    else if( 25 <= BMI && BMI< 29.9)
    {
      return "over weight";
    }
    else{
       return "obese";
    }
     
    }
    void printRecord()
    {
        System.out.println("your bmi is : " +BMI);
        System.out.println("you are :" +classifyBMI());
    }

    public static void main(String[] args)
    {
        BMITracker bmi  = new BMITracker();

        bmi. acceptRecord();
        bmi.  calculateBMI();
        bmi.classifyBMI() ;
        bmi.printRecord();
    }
}
