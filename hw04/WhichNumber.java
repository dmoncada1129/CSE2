//Daniel Moncada
//CSE2
//feb 15, 2015
//WhichNumber.java
//code that will try to guess the users input with various parameters 

import java.util.Scanner;
import java.text.DecimalFormat;
public class WhichNumber {
    
        public static void main (String [ ] args) {
            
            Scanner myScanner; //declaring scanner
            myScanner = new Scanner (System.in); 
            System.out.println("Think of a number between 1 and 10 inclusive. Is it even? "); 
            String answer1 = myScanner.next();      //making sure that the input is a string
            if (answer1.equals("y")) {  //if the answer is equal to y
                System.out.print("Is it divisible by 3? "); 
                String answer2 = myScanner.next();      //if answer2 is equal to y then print out 6
                if (answer2.equals("y")) {
                    System.out.println("6");
                }
                else {
                System.out.print("Is the number divisible by 4? ");
                String answer3 = myScanner.next();
                if (answer3.equals("y")) {
                    System.out.print("Is the number divided by 4 greater than 1? ");
                    String answer4 = myScanner.next();
                    if (answer4.equals("y")) { //making sure that if it is equal to y, print out 8
                    System.out.println("8");    
                    }
                    else if (answer4.equals("n")) { //making sure that answer4 equals n, then printing out 4
                        System.out.println("4");
                    }
                    else {
                 System.out.println("sorry thats not a valid input "); //if its not n or y, that is an invalid input
             }
                }
                else if (answer3.equals("n")) {
                    System.out.print("Is it divisible by 5? "); //if divisble by 5, n
                    String answer5 = myScanner.next();
                    if (answer5.equals("y")) { //if it equals y, then print out 10
                        System.out.print("10");
                    }
                    else if (answer5.equals("n")) {
                        System.out.print("2");
                    }
                    else {
                 System.out.println("sorry thats not a valid input "); //invalid input 
             }
                    
           }
                
         }
     }
            else if (answer1.equals("n")) { //if it equals n, then it will be either divisable by 3 or greater than 6
                    System.out.print("Is it divisble by 3? ");
                    String answer6 = myScanner.next();
                    if (answer6.equals("y")) { 
                        System.out.print("When divided by 3 is the result greater than 1? "); //when it is y, equal 9
                        String answer7 = myScanner.next();
                        if (answer7.equals("y")) {
                            System.out.print("9");
                        }
                        else if (answer7.equals("n")) { //if n it is 3
                            System.out.print("3");
                        }
                        else {
                 System.out.println("sorry thats not a valid input ");
                    }
             
             /// COMMENTS APPLY TO ALL BELOW AS WELL, BUT WITH DIFFERENT NUMBERS
             
                    }
                    else if (answer6.equals("n")) {
                        System.out.print("Is it greater than 6? ");
                        String answer8 = myScanner.next();
                        if (answer8.equals("y")) {
                            System.out.print("7");
                        }
                        else if (answer8.equals("n")) {
                            System.out.print("Is it less than 3? ");
                            String answer9 = myScanner.next();
                            if (answer9.equals("y")) {
                                System.out.print("1");
                            }
                            else if (answer9.equals("n")) {
                                System.out.print("5");
                            }
                            
                        }
                    
                }
                else {
                 System.out.println("sorry thats not a valid input ");
             }
                
            }
             else {
                 System.out.println("sorry thats not a valid input ");
            }
       }
}
        