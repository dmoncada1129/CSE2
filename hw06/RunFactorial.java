import java.util.Scanner; 
import java.util.Random;
import java.lang.Math;

public class RunFactorial {
    
        public static void main (String [] args ) {
            
                Scanner myScanner;
                int x = 1;
                int factorial=1;
                int input;
                myScanner = new Scanner(System.in);
                System.out.println("put in an int and i will show you its factorial");
                while (true) {
                        input = myScanner.nextInt();
                        if (input<9 || input >16) {
                                System.out.println("please enter a valid int");
                        }
                        else{
                                break;
                        }
                }
                for (int i=input; i >0; i--) {
                        factorial *= i;
                }
                System.out.println("this is my input "+ input + "and this is my factorial " + factorial);
                        
                
                
        }
}