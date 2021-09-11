import java.io.FileWriter;
import java.io.IOException;

public class Location {

	// private variables for storing the values.
	private String city, state, country;

	// Constructor for set the values.
	public Location(String[] arr) {
		this.city = arr[6];
		this.state = arr[7];
		this.country = arr[8];
	}

	// getter methods
	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getCountry() {
		return country;
	}

	// This helper method used to create multiple output files based on input.
	public static void writeFile(AirLine object, String name, String arr) throws IOException {
		FileWriter fw = new FileWriter(name + "_" + arr + "_List.csv");
		fw.write(object.toString());
		fw.close();
	}

}
