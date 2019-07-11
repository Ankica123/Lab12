import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class CarApp {

	public static void main(String[] args) {
		

		List<Car> cars = new ArrayList<Car>();


		Set<String> models = new TreeSet<>();

		for (Car c : cars) {
			models.add(c.getCarModel());
		}
		Scanner scan = new Scanner(System.in);
	

		System.out.println("Welcome to the Grand Circus Motors admin console!");
		System.out.println("How many cars are you entering?");
		String input = scan.nextLine();
		System.out.println();
		System.out.println("Current Inventory:");
		 
		System.out.println("Enter Car #1 Make " + input);
		System.out.println("Enter Car #1 Model " + input);
		System.out.println("Enter Car #1 Year " + input);
		System.out.println("Enter Car #1 Price " + input);
		  



	}
}
