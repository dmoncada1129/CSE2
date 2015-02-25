//Daniel Moncada
//CSE2 hw 5
//ToHex program
//2.24.15



import java.util.Random; //importing random
import java.lang.Math; //importing math
import java.util.Scanner; //importing scanner

public class  ToHex {
	
		public static void main (String [] args) {
		    
 /*To convert from decimal to hex, divide the user’s input by 16 and 
 * find how many times 16 can fully go into the users number.
 *  For example, the number of times 16 goes into 75 is 4 with a remainder of 11. 4 and 11 
 *  need to be converted to hex (use the table below for help). 4 remains 4 in hexadecimal, 
 *  but 11 is represented as ‘B’. Combine the two and you get 4B -- your answer.
 *   Repeat this process for all three input values.
If a decimal number is from 0-9, the hexadecimal value will be the same value as the remainder. 
However, if a decimal number is 10 or higher, then the number’s hexadecimal value will be a letter.
*/
		    
		        Scanner myScanner;
		        myScanner = new Scanner (System.in);
		        System.out.print("Please enter 3 rgb values"); //inputing scanner and input
		        int r = myScanner.nextInt(); //int for red
		        int g = myScanner.nextInt(); //int for blue
		        int b = myScanner.nextInt(); //int for green
		       /* int g = myScanner.nextInt();
		        int b = myScanner.nextInt();*/
		        int r1 = r/ 16;  //divides by 16, for first digit
		        int r2 = r % 16; //mod 16, converts to hex
		        String r3 = "", r4=""; //so that r3 and r4 run even if it may not be initialized

		        if (r >= 0 && r <= 255) { //condition that it has to be within a range of values
		           
		          if (r2 <=9 && r2 >= 0) { //if it is inbetween 9 and 0, condition that it will print out that #
		               r3 = ""+r2;
		          }
		          else if (r2 >= 10 && r2 <= 15) { //if in between 10 and 15, follow into swithc statement
		              switch (r2) {
		                  case 10:
		                       r3 = ("A");
		                       break;
		                   case 11:
		                   				r3 = ("B");
		                   				break;
		                   case 12:
		                   				r3 = ("C");
		                   				break;
		                   case 13:
		                   				r3 = ("D");
		                   				break;
		                   case 14:
		                   				r3 = ("E");
		                   				break;
		                   case 15:
		                   				r3 = ("F");
		                   				break;
		              }
		          }
		          
		          if (r1 <=9 && r1 >= 0) { //this and below is for second digit
		               r4 = ""+r1;
		          }
		          else if (r1 >= 10 && r1 <= 15) {
		              switch (r1) {
		                  case 10:
		                       r4 = ("A");
		                       break;
		                   case 11:
		                   				r4 = ("B");
		                   				break;
		                   case 12:
		                   				r4 = ("C");
		                   				break;
		                   case 13:
		                   				r4 = ("D");
		                   				break;
		                   case 14:
		                   				r4 = ("E");
		                   				break;
		                   case 15:
		                   				r4 = ("F");
		                   				break;
		              }
		          }

		       }
		      
		       
		        //anything below is the same as above, but replacing r with g and b for those values to allow for different combonations
		       	int g1 = g/ 16; 
		        int g2 = g % 16;
		        String g3 = "", g4="";
		        if (g >= 0 && g <= 255) {
		           
		          if (g2 <=9 && g2 >= 0) {
		               g3 = ""+g2;
		          }
		          else if (g2 >= 10 && g2 <= 15) {
		              switch (g2) {
		                  case 10:
		                       g3 = ("A");
		                       break;
		                   case 11:
		                   				g3 = ("B");
		                   				break;
		                   case 12:
		                   				g3 = ("C");
		                   				break;
		                   case 13:
		                   				g3 = ("D");
		                   				break;
		                   case 14:
		                   				g3 = ("E");
		                   				break;
		                   case 15:
		                   				g3 = ("F");
		                   				break;
		              }
		          }
		          
		          if (g1 <=9 && g1 >= 0) {
		               g4 = ""+g1;
		          }
		          else if (g1 >= 10 && g1 <= 15) {
		              switch (g1) {
		                  case 10:
		                       g4 = ("A");
		                       break;
		                   case 11:
		                   				g4 = ("B");
		                   				break;
		                   case 12:
		                   				g4 = ("C");
		                   				break;
		                   case 13:
		                   				g4 = ("D");
		                   				break;
		                   case 14:
		                   				g4 = ("E");
		                   				break;
		                   case 15:
		                   				g4 = ("F");
		                   				break;
		              }
		          }

		       }
		      
		       int b1 = b/ 16; 
		        int b2 = b % 16;
		        String b3 = "", b4="";
		        if (b >= 0 && b <= 255) {
		           
		          if (b2 <=9 && b2 >= 0) {
		               b3 = ""+b2;
		          }
		          else if (b2 >= 10 && b2 <= 15) {
		              switch (b2) {
		                  case 10:
		                       b3 = ("A");
		                       break;
		                   case 11:
		                   				b3 = ("B");
		                   				break;
		                   case 12:
		                   				b3 = ("C");
		                   				break;
		                   case 13:
		                   				b3 = ("D");
		                   				break;
		                   case 14:
		                   				b3 = ("E");
		                   				break;
		                   case 15:
		                   				b3 = ("F");
		                   				break;
		              }
		          }
		          
		          if (b1 <=9 && b1 >= 0) {
		               b4 = ""+b1;
		          }
		          else if (b1 >= 10 && b1 <= 15) {
		              switch (b1) {
		                  case 10:
		                       b4 = ("A");
		                       break;
		                   case 11:
		                   				b4 = ("B");
		                   				break;
		                   case 12:
		                   				b4 = ("C");
		                   				break;
		                   case 13:
		                   				b4 = ("D");
		                   				break;
		                   case 14:
		                   				b4 = ("E");
		                   				break;
		                   case 15:
		                   				b4 = ("F");
		                   				break;
		              }
		          }

		       }
		       
			
				System.out.println("The decimal numbers " + "R: " + r + " G: " + g + " B " +  b + " is represented in hexadecimal as: " + r4+r3+g4+g3+b4+b3);
		}
}