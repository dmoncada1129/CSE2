//Daniel Moncada
//CSE2
//Spring term
//FEB 7, 2015
//Professor Chen


import java.util.Scanner; //importing scanner

public class Root {
    
        public static void main(String [ ] args) {
            
            Scanner myScanner;
            myScanner = new Scanner (System.in); //declaring myscanner
            System.out.print("Enter a double, and I print it's cube root ");
            double number = myScanner.nextDouble(); //making sure the number u put in is a double
            double guess = number/3; //the initial guess is divided by 3
            
            double firstGuess = (2*guess*guess*guess+number)/(3*guess*guess); //the formula for the first guess
            double secondGuess = (2*firstGuess*firstGuess*firstGuess+number)/(3*firstGuess*firstGuess); //integrating the first guess into the scond guess
            double thirdGuess = (2*secondGuess*secondGuess*secondGuess+number)/(3*secondGuess*secondGuess); //etc.
            double fourthGuess = (2*thirdGuess*thirdGuess*thirdGuess+number)/(3*thirdGuess*thirdGuess);// same as above except w. fourth guess
            double fifthGuess = (2*fourthGuess*fourthGuess*fourthGuess+number)/(3*fourthGuess*fourthGuess); //etc.
            
            double cube = (fifthGuess)*(fifthGuess)*(fifthGuess); //making the cube a double and declaring the actual value of the cube
            
            System.out.println("The cube root of " + number + " is " + fifthGuess);
            System.out.println("The cube of the estimate " + number);
            
        }
}