//Daniel Moncada
//CSE2
//Cookies lab
//lab 04
// 2.12.15

import java.util.Scanner;

public class Cookies {
        
        public static void main(String [ ] args) {
            
            Scanner myScanner;
            myScanner = new Scanner (System.in);
             System.out.print("Enter the number of people ");
            
            if (myScanner.hasNextInt()) {
                int nPeople = myScanner.nextInt();
                System.out.print("Enter the number of people eating the cookies ");
                int cookie = myScanner.nextInt();
                System.out.print("How many cookies will each person get? ");
                int per = myScanner.nextInt();
                int total = nPeople * per;
                int remainder = nPeople % per;
                int leftovers = total - cookie;
                
                if (remainder == 0 && total<cookie) {
                    System.out.println("You have enough cookies for each persona nd the amount will divide evenly");
                }
                else if (remainder !=0 && total<cookie) {
                    System.out.println("You have enough cookies but you will have some left over :) ");
                }
                else if (remainder>0 && total>cookie){
                    System.out.println("You don't have enough cookies, you need " + leftovers + "more");
                }
                else if (nPeople < 0 ) {
                    System.out.println("You didn't enter an int > 0");
                }
                }
                else {
                    System.out.println("You did not enter an int");
                }
            }
        }
