package gcLab12;

public class UsedCar extends Car{

	private double mileage;

	public UsedCar(String make, String model, int year, double price, double mileage) {
		
		super(make, model, year, price);
		this.mileage = mileage;
		
	}
	



	
	public UsedCar(String make, String model, int year, double price, double mileage, Dealership dealer) {
		super(make, model, year, price, dealer);
		this.mileage = mileage;
	}





	@Override
	public String toString() {
		return "UsedCar [mileage=" + mileage + ", toString()=" + super.toString() + "]";
	}



	public double getMileage() {
		return mileage;
	}

}
