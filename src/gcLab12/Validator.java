package gcLab12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Validator {
	public static boolean yesOrNo(Scanner scn, String prompt) {
		String userInput;
		boolean yesOrNo;
		Set<String> validYes = new HashSet<>(Arrays.asList("yes","y","yeah","yep","1","ok","okay"));
		Set<String> validNo = new HashSet<>(Arrays.asList("no","nope","n","0","nah"));
		
		do {
			System.out.println(prompt);
			userInput = scn.nextLine().toLowerCase();
			if(validYes.contains(userInput)) {
				yesOrNo = true;
				break;
			} else if (validNo.contains(userInput)) {
				yesOrNo = false;
				break;
			} else {
				
			} 
		} while(true);
		
		return yesOrNo;
		
	}
}
