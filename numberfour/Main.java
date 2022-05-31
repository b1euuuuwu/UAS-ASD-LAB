package numberfour;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String pattern = "good";
        int counter = 0;
        int firstOccurrence = 0;
    
        int textLen = text.length();
		int patternLen = pattern.length();
		int patternsFound = 0;

		boolean found = false;

		for (int i = 0; i+patternLen <= textLen; i++) {
			boolean curr_found = true;
			for (int j = 0; j<patternLen; j++) {
				if (text.charAt(i+j) != pattern.charAt(j)) {
					curr_found = false;
					break;
				}
			}
			if (curr_found) {
				found = true;
				patternsFound +=1;;
                counter++;
                firstOccurrence = i;
			}
		}
		if (!found)
			System.out.println("Pattern not found using naive");
	
        System.out.println("Score: " + counter);
        System.out.println("The first occurrence is at: " + firstOccurrence);
    }
}
