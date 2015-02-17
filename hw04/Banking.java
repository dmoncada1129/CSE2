//Daniel Moncada
//CSE2
//feb 15, 2015
//Banking.java
//code that will subtract, add, and change the users input, printing the result
//HW 4




import java.util.Scanner; //importing scanner class
import java.text.DecimalFormat; //importing decimalformat class
import java.util.Random; //importing random calss
import java.lang.Math; //imporitng math lang class

public class Banking {
    
        public static void main (String [ ] args) {
                DecimalFormat df = new DecimalFormat("####0.00"); //declainrg the standards that decimal format will take
                Scanner myScanner; //setting up  scanner
                myScanner = new Scanner (System.in);
                double money = ((double) (5*Math.random()))*1000; //making the value a number from 1000-5000 (including decimals)
               
                System.out.println("You have " + df.format(money) + " left in your bank account. Would you like to deposit(1) or withdraw(2)?"); 
                int answer1 = myScanner.nextInt(); //making the answer an int (1 or 2)
                switch (answer1) { //switch case
                        case 1:
                                System.out.print("how much would you like to deposit" );
                                double deposit = myScanner.nextDouble(); //making the input a double 
                                if (deposit > 0) { //making sure that the deposit is greater than 0
                                        System.out.println("You now have "+ df.format(money + deposit) + "left in your bank account."); 
                                }
                                else { //this will happen if the user inputs a value less than the required amount
                                        System.out.println("Please enter a valid input. ");
                                }
                        break;
                        case 2: //how much the user would like to subtract from their balance
                                System.out.print("how much would you like to withdraw from your account ");
                                double withdraw = myScanner.nextDouble();
                                if (withdraw <= money) { //the withdrawal has to be less than or equal to the users balance
                                        System.out.println("You now have " + df.format(money - withdraw) + "left in your account");
                                        
                                }
                                else {
                                        System.out.println("please enter a valid input");
                                }
                        default:
                        System.out.println("pls enter valid input"); //case where user does not enter valid input
                }
        }
}