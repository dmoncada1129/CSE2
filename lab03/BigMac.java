//Daniel Moncada
//CSE2 Spring Term
//Feb 4, 2015
//Big Mac Lab
//Professor Chen
//Program that is meant to obtain form user how many big macs, cost, and percentage tax.
//also should display total cost
import java.util.Scanner;

public class BigMac {
        
        public static void main(String [ ] args) {
            
            Scanner myScanner;
            myScanner = new Scanner (System.in);
            System.out.print(
                "Enter the number of BIg Macs (an interger > 0): ");
            
            int nBigMacs =myScanner.nextInt();
            System.out.print("Enter the cost per BIg Mac as" + " a double (in the form xx.xx) :");
            double bigMac$= myScanner.nextDouble();
            System.out.print(
                "Enter the percent tax as a whole number (xx): ");
            double taxRate = myScanner.nextDouble();
            taxRate/=100; //user enters percednt, but I want proportion
            
            double cost$;
            int dollars;    //whole dollar amount of cost
            int dimes;      //for storing digits
            int pennies;    //for the cost$
            cost$= nBigMacs*bigMac$*(1 + taxRate); //get the whole amount, dropping deccimal fraction
            dollars=(int)cost$;
            dimes=(int)cost$;
            pennies=(int)(cost$*100)%10;
            System.out.println("The total cost of " + nBigMacs +" BigMacs, at $"+bigMac$ + "per bigMac, with a "+" sales tax of " + (int)(taxRate*100) + "%, is $"+ dollars+'.'+dimes+pennies);
            
            
            
            
            
        }
}

