import java.util.Scanner;

public class GetIntegers {
	
		public static void main (String [] args) {
			
			Scanner myScanner;
			myScanner = new Scanner (System.in);
			int sum = 0;
			int x = 0; 
			System.out.print("please enter 5 non negative ints");
			for (int i=0; i<5; i++) { //setting up for loop
				if ( myScanner.hasNextInt()) { //myscanner
					x = myScanner.nextInt(); 
					if (x<0) { //if it's less than 0, it does not work
						System.out.println("please put in a valid integer");
						x--; //minus 1 from x to not count that input as a valid input
					}
					else { //the sum is now equal to this number plus the sum, and this will loop 5 times
						sum = sum + x;
					}
				}
 			else { 
 				String g = myScanner.next(); //same as above in an invalid condition
 				System.out.println("please put in a valid input");
 				x--; 
 				
 			}
		}
			System.out.println("the sum of all the numbers is "+ sum);
	}
}
