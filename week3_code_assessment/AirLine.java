
public class AirLine {

	// These variables helps to store values.
	private String airline_name, frequent_flyer, alliance_name, website;
	// These are object declaration for Designator and Location class.
	private Designator des;
	private Location local;

	// constructor helps to initialize the variables.
	public AirLine(String[] arr) {
		this.airline_name = arr[0];
		this.frequent_flyer = arr[4];
		this.alliance_name = arr[5];
		this.website = arr[9];
		this.des = new Designator(arr);
		this.local = new Location(arr);
	}

	// These are getter methods.
	public String getAirLineName() {
		return airline_name;
	}

	public String getFrequentFlyer() {
		return frequent_flyer;
	}

	public String getAllianceName() {
		return alliance_name;
	}

	public String getWebsite() {
		return website;
	}

	// This method helps to print the values.
	public String toString() {
		return getAirLineName() + "," + des.getIATA() + "," + des.getICAO() + "," + des.getAirCallSign() + ","
				+ getFrequentFlyer() + "," + getAllianceName() + "," + local.getCity() + "," + local.getState() + ","
				+ local.getCountry() + "," + getWebsite() + "\n";
	}
}
