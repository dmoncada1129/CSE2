/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danilemoncada
 */
import java.util.Scanner;

public class lab04 {
    public static void main (String [] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        System.out.print("Enter the number of people");
        int p = myScanner.nextInt();
        if (myScanner.hasNextInt()) {
            System.out.print("Enter the number of cookies you're buying");
            int c = myScanner.nextInt();
            if (myScanner.hasNextInt()) {
                System.out.print("how many do you want each person to get");
                int g = myScanner.nextInt();
                    if (myScanner.hasNextInt()) {
                        int remainder = c/g;
                        if (remainder==p){
                            System.out.println("you have juse enough cookies");
                        }
                    }
                    else if (g<0){
                     System.out.println("please enter a valid value");
                    return;
                    }
                    else {
                    System.out.println("please enter a valid value");
                    return;
                    }
                    
            }
            else if (c<0){
                System.out.println("please enter a valid value");
                 return;
                    }
            else {
                System.out.println("please enter a valid value");
                return;
            }
            
        }
        else if (p<0){
            System.out.println("please enter a valid value");
            return;
                    }
        else {
            System.out.println("please enter a valid value");
            return;
            }
    }
    
}
