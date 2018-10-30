import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Scanner;

public class SortBabyNamesDavis {

	public static void main(String[] args) {
		// Spencer Davis

		String address = "//bbmedia.dmacc.edu/CIS/CIS171/babynames2014.txt";
		String value = "";
		
		try {
			// Try block to go to URL and if the url is valid grab the data
			URL pageLocation = new URL(address);
			Scanner in = new Scanner(pageLocation.openStream());
			PrintWriter outBoys = new PrintWriter("boys.txt");
			PrintWriter outGirls = new PrintWriter("girls.txt");
			
			// While there is another line to grab data from
			while (in.hasNextLine()) {
				
				// Grabs value of line
				value = in.nextLine();
				
				if (value.contains("girl")) {
					
					// Removes the girl and space from value
					value = value.replace("girl ", "");
					outGirls.println(value);
					
				} else if (value.contains("boy")) {
					
					// Removes the boy and space from value
					value = value.replace("boy ", "");
					outBoys.println(value);
				}
			}
			
			// Close it all down
			outBoys.close();
			outGirls.close();
			in.close();
			
		} catch (IOException ex) {
			// Prints technical message + friendly message
			System.out.println(ex.getMessage());
			System.out.println("Could not find address " + address);
		}
	}

}
