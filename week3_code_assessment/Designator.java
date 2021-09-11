
public class Designator {

	private String IATA, ICAO, airline_Call_sign;

	// Constructor helps to initialize the variables.
	public Designator(String[] arr) {
		this.IATA = arr[1];
		this.ICAO = arr[2];
		this.airline_Call_sign = arr[3];
	}

	// Getter methods
	public String getIATA() {
		return IATA;
	}

	public String getICAO() {
		return ICAO;
	}

	public String getAirCallSign() {
		return airline_Call_sign;
	}

}
