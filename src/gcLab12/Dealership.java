package gcLab12;

public class Dealership {
	
	private String name = "DeNooyer";
	private String city = "Kalamazoo";
	
	public Dealership() {
		
	}
	
	public Dealership(String name, String city) {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Dealership [name=" + name + ", city=" + city + "]";
	}
	

}
