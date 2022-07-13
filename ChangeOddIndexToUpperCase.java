package week1.day2;

public class ChangeOddIndexToUpperCase {
	public static void main(String[] args) {
	 //Initializing the String
		String test = "changeme";
		
	  //converting the string to array
		char[] ch1 = test.toCharArray();
		
	// looping through all characters
		for (int i = 0; i < ch1.length; i++) {

	 //  finding the odd index and changing it to upper case
			if (i % 2 != 0) {
				System.out.print(Character.toUpperCase(ch1[i]));
			} else
				System.out.print(ch1[i]);
		}

	}
}
