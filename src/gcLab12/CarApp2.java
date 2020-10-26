package gcLab12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarApp2 {
	private static List<Car> availableCars = new ArrayList<>();
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int userSelection = -1;
		Dealership dealer = new Dealership("Denooyer", "Kalamazoo");
		
		Car a = new Car("Nikolai","Model S", 2017, 54999.90,dealer);
		Car b = new Car("Fourd","Escapade", 2017, 31999.90,dealer);
		Car c = new Car("Chewie","Vette", 2017, 44989.90,dealer);
		Car d = new UsedCar("Hyonda","Prior", 2015, 14795.90,35987.6,dealer);
		Car e = new UsedCar("GC","Chirpus", 2013, 8500.90, 12345,dealer);
		Car f = new UsedCar("GC","Witherell", 2016, 14450.90, 3500.3,dealer);
		
		availableCars.add(a);
		availableCars.add(b);
		availableCars.add(c);
		availableCars.add(d);
		availableCars.add(e);
		availableCars.add(f);
		
		try {
			while(availableCars.size()>0) {

					displayCars();

					System.out.println("Which car would you like? ");
					userSelection = scn.nextInt()-1;
					displaySelectedCar(userSelection);
					scn.nextLine();
					
					if(Validator.yesOrNo(scn,"Would you like to buy this car? ")) {
						System.out.println("Excellent! Our finance department will be in touch shortly.");
						availableCars.remove(userSelection);
					} else {
						
					}		
			} 
		} catch (IndexOutOfBoundsException e1) {

		}
		System.out.println("Have a great day!");
		scn.close();
		for(int i = 0; i < availableCars.size(); i++) {
			System.out.println(availableCars.get(i).toString());
		}


	}
	
	public static void displayCars() {
		System.out.println("Current Inventory: ");
		System.out.printf("%-14s %-10s %-10s %-10s %-10s\r\n", "Enter to Select", "Make", "Model", "Year", "Price");
		for (int i = 0; i < availableCars.size(); i++) {
			if (availableCars.get(i) instanceof UsedCar) {
				Car temp = new Car();
				temp = availableCars.get(i);
				UsedCar u = (UsedCar) temp;
				System.out.printf("%-14s %-10s %-10s %-10s $%-10s %-10s\r\n", i + 1, u.getMake(), u.getModel(),
						u.getYear(), u.getPrice() + " (Used)", u.getMileage() + " miles");
			} else {
				System.out.printf("%-14s %-10s %-10s %-10s $%-10s\r\n", i + 1, availableCars.get(i).getMake(),
						availableCars.get(i).getModel(), availableCars.get(i).getYear(),
						availableCars.get(i).getPrice());
			}
	}
		System.out.printf("%-14s %-10s\r\n", availableCars.size()+1, "Quit");
	}
	
	public static void displaySelectedCar(int userSelection) {
		if (availableCars.get(userSelection) instanceof UsedCar) {
			Car temp = new Car();
			temp = availableCars.get(userSelection);
			UsedCar u = (UsedCar) temp;
			System.out.printf("%-14s  %-10s %-10s $%-10s %-10s\r\n", u.getMake(), u.getModel(), u.getYear(),
					u.getPrice() + " (Used)", u.getMileage() + " miles");
		} else {
			System.out.printf("%-14s  %-10s %-10s $%-10s\r\n", availableCars.get(userSelection).getMake(),
					availableCars.get(userSelection).getModel(), availableCars.get(userSelection).getYear(),
					availableCars.get(userSelection).getPrice());
		} 
	}
	
}
