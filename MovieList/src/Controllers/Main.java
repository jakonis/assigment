package Controllers;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	  String delims = "[|]";
	  Scanner scanner = new Scanner(new File("./moviedata_small/users5.dat"));
	  
	  while (scanner.hasNextLine()) {
	      String userDetails = scanner.nextLine();
	      // parse user details string
	      String[] userTokens = userDetails.split(delims);

	      if (userTokens.length == 7) {
	          System.out.println("UserID: " + userTokens[0] + ",First Name:" + userTokens[1]);
	      } else {
	    	  
	          scanner.close();
	          throw new IOException("Invalid member length: " + userTokens.length);
	      }
	  }
	  scanner.close();
	}
	
}
