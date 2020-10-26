package gcLab12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		
		List<Car> availableCars = new ArrayList<>();
		Scanner scn = new Scanner(System.in);
		
		while (Validator.yesOrNo(scn, "Would you like to enter a car?")) {
			String carMake;
			String carModel;
			int carYear;
			double carPrice;
			
			System.out.println("Enter Car Make: ");
			carMake = scn.nextLine();
			System.out.println("Enter Car Model: ");
			carModel = scn.nextLine();
			System.out.println("Enter Car Year: ");
			carYear = scn.nextInt();
			scn.nextLine();
			System.out.println("Enter Car Price: ");
			carPrice = scn.nextDouble();
			scn.nextLine();
			
			Car newCar = new Car(carMake, carModel, carYear, carPrice);
			availableCars.add(newCar);
			
		}
		
		System.out.println("Current Inventory: ");
		System.out.printf("%-14s %-10s %-10s %-10s\r\n","Make","Model","Year","Price");
		for(Car entry : availableCars) {
			System.out.printf("%-14s %-10s %-10s $%-10s\r\n",entry.getMake(),entry.getModel(),entry.getYear(),entry.getPrice());
		}
		
	}

	
	
}
