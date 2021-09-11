import java.io.*;

public class Driver {

	public static void main(String[] args) {
		BufferedReader br, in;
		// try-catch for IOException handling
		try {
			// Getting input from user through console.
			in = new BufferedReader(new InputStreamReader(System.in));
			// Read the given file.
			br = new BufferedReader(new FileReader("ListOfAirLines.txt"));

			String name = in.readLine();

			String s;
			// Repeatedly reading the file line by line.

			while ((s = br.readLine()) != null) {
				// split the given line and stored into an array
				String arr[] = s.split(",");

				// Passing the string array to the Airline constructor.
				AirLine object = new AirLine(arr);

				

			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
