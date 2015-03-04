import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class MakeSymbols {
    
    public static void main (String [] args ) {
        int x = (int)(Math.random()*100 +1); //setting up random int
        int count = x; //setting up counter
        do {
            if (x%2==0){ //setting up even int
                System.out.print("*");
                count--; //minus so that it will do it over and over
            }
            else { //case for the odd number
                System.out.print("&");
                count--; //same as above
            }
        }while(count>0); //setting while loop
    } 
}