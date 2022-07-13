package week1.day2;

public class Palindrome {
	public static void main(String[] args) {
		String str1 = "madam";
		char[] ch1 = str1.toCharArray();
		
		//Declaring another String rev value as ""
		String rev = "";
		//Iterate over the String in reverse order
		for (int i = ch1.length - 1; i >= 0; i--) {
			
		//Adding the ch1 into rev
			rev = rev + ch1[i];
		}
		//Compare the original String with the reversed String
		if (str1.equals(rev)) {
			// Printing if both are same
			System.out.println("Its a palindrome word");
		} else
			System.out.println("Its not a plaindrome word");

	}
}
