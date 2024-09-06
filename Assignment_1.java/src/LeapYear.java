
	
	import java.util.Scanner;

	public class LeapYear {
		public static void main(String[] args) {
			
			System.out.println("Enter year: ");
			Scanner sc = new Scanner(System.in);
			int year = sc.nextInt();
			
			int flag = 0;
			if(year % 400 == 0) {
				flag = 1;
			} else if (year % 100 == 0) {
				flag = 0;
			} else if (year % 4 == 0) {
				flag = 1;
			} else {
				flag = 0;
			}
	
			switch(flag) {
			case 1:
				System.out.println(year + " is a leap year");
				break;
			case 0: 
				System.out.println(year + " is not a leap year");
				break;
			}
		}
	}
	

