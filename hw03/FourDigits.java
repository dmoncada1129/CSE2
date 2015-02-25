//Daniel Moncada
//CSE2
//Spring term
//FEB 7, 2015
//Professor Chen

()
import java.util.Scanner; //importing the scanner
import java.text.DecimalFormat; //imporating a tool to truncate the decimals
public class FourDigits {
    
        public static void main(String [ ] args) {
            DecimalFormat df = new DecimalFormat("0000"); //making it so that decimalformat limits it to 4 characters
            
            Scanner myScanner;
            myScanner = new Scanner (System.in); //declaring myScanner
            System.out.print("enter here "); //the input for the scanner
            double n = myScanner.nextDouble(); //declaring the variable of the input 
            double n1 = n - (int)n; //n1 will be equal to n - the int of n, singling out the decimals
            double n2 = n1 * 10000; //making the decimals whole numbers
            String n3 = df.format(n2); //truncating the decimals completely
            System.out.println(n3); //printing the value 
        }
}