package week1.day2;
public class RemoveDuplicates {
	public static void main(String[] args) {
		
		// declared String text as input String text = "We learn java basics as part of java sessions in java week1"
		String text = "We learn java basics as part of java sessions in java week1";
		
		//Split the String into array
		String[] split1 = text.split(" ");
		
		// Initialize an integer variable as count
		int count = 0;
		
		//looping
		for (int i = 0; i < split1.length; i++) {
			
			// Initialize another loop to check whether the word is there in the array
			for (int j = i + 1; j < split1.length; j++) {
				if (split1[i].equalsIgnoreCase(split1[j])) {
					
					// Increasing the count if its found					
					count++;
						if (count >= 1) {
							
							//if the count > 1 then replace the word as "" 
						split1[j] ="";
					}
				}				
			}
			//Displaying the String without duplicate words
			System.out.print(split1[i]+" ");

		}
	}
}
