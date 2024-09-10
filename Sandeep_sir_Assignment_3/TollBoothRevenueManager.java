
	import java.util.Scanner;

	public class TollBoothRevenueManager {
	   
	    private double carTollRate;
	    private double truckTollRate;
	    private double motorcycleTollRate;
	    private int numCars;
	    private int numTrucks;
	    private int numMotorcycles;
	    private double totalRevenue;

	    
	    public void setTollRates() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the toll rate for Cars : ");
	        carTollRate = scanner.nextDouble();
	        System.out.print("Enter the toll rate for Trucks : ");
	        truckTollRate = scanner.nextDouble();
	        System.out.print("Enter the toll rate for Motorcycles : ");
	        motorcycleTollRate = scanner.nextDouble();
	       
	    }
	   
	    public void acceptRecord() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of Cars: ");
	        numCars = scanner.nextInt();
	        System.out.print("Enter the number of Trucks: ");
	        numTrucks = scanner.nextInt();
	        System.out.print("Enter the number of Motorcycles: ");
	        numMotorcycles = scanner.nextInt();
	        scanner.close();
	    }

	    
	    public void calculateRevenue() {
	        totalRevenue = (numCars * carTollRate) + (numTrucks * truckTollRate) + (numMotorcycles * motorcycleTollRate);
	    }

	    
	    public void printRecord() {
	        int totalVehicles = numCars + numTrucks + numMotorcycles;
	        System.out.println("Total number of vehicles: " + totalVehicles);
	        System.out.printf("Total revenue collected: %.2f\n", totalRevenue);
	    }

	    
	    public static void main(String[] args) {
	        TollBoothRevenueManager tollBooth = new TollBoothRevenueManager();
	        tollBooth.setTollRates();     
	        tollBooth.acceptRecord();      
	        tollBooth.calculateRevenue(); 
	        tollBooth.printRecord();       
	    }
	}


