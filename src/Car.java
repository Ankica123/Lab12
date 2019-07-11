public class Car {

	private String make;
	private String model;
	private int year;
	private double price;

	public Car(String make, String model, int year, double price) {

		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	public Car(String string, String string2, String string3) {

	}

	public String setCarMake(String make)

	{
		this.make = make;
		return make;
	}

	public String getCarMake() {
		return make;
	}

	public String setCarModel(String model)

	{
		this.model = model;
		return model;
	}

	public String getCarModel() {
		return model;
	}

	public int setCarYear(int year)

	{
		this.year = year;
		return year;
	}

	public int getCarYear() {
		return year;
	}

	public double setCarPrice(double price)

	{
		this.price = price;
		return price;
	}

	public double getCarPrice() {
		return price;
	}

	public String toString()

	{

		return "Car make: " + make + "Car model: " + model + "Car Year:" + year + "Car price:" + price;

	}

}



