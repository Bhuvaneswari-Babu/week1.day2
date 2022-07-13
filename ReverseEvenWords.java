package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {		
		// Declare the input as Follow String test = "I am a software tester"; 
		String test = "I am a software tester"; 
		
		//split the words and have it in an array
		String[] split1 = test.split(" ");
		
		//Traverse through each word (using loop)
		for (int i = 0; i < split1.length; i++) {
			//find the odd index within the loop (use mod operator)	
			if(i%2!=0) {
				char[] ch1=split1[i].toCharArray();
				//nested looping
				for (int j = ch1.length-1; j >=0; j--) {
					System.out.print(ch1[j]);
				}				
			}
			else
				System.out.print(" "+split1[i]+" ");			
		}		
	}
}
