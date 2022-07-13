package week1.day2;

public class FindIntersection {	
	  	public static void main(String[] args) {		 
// Declaring two arrays {3,2,11,4,6,7} {1,2,8,4,9,7};
		int[] a1 = { 3, 2, 11, 4, 6, 7 }, a2 = { 1, 2, 8, 4, 9, 7 };
		
		// looping 
		for (int i = 0; i < a1.length - 1; i++) {
			
		// nested loop
			for (int j = 0; j < a2.length - 1; j++) {
		// Comparing Both the arrays
				if (a1[i] == a2[j]) {
		// printing the first intersection number
					System.out.println(a1[i]);
					return;
				}
			}
		}
	}
}
