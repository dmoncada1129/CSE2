//Daniel Moncada
//CSE2
//Spring term
//FEB 7, 2015
//Professor Chen
//Bicycle program
//Program is meant to take input from user, giving # of counts on a cyclometer
//should also give seconds during which the counts occured, printing distance traveled & avg mph

import java.util.Scanner;
import java.text.DecimalFormat; //making it so that the double becomes more truncated

public class Bicycle {
        
        public static void main(String [ ] args) {
            DecimalFormat dd = new DecimalFormat("#.##"); //truncating the double
            Scanner myScanner;
            myScanner = new Scanner (System.in); //declaring scanner
            double pi=3.14159; //makes variable PI the value of pi
            int feetPerMile=5280; //assigns value to feetPerMile
            int inchesPerFoot=12; //assigns 12 as the amount of inches in a foot
            int secondsPerMinute=60; //60 seconds in a minute
            double wheelDiameter=27.0; //puts wheel diameter information as a decimal
            double distance;
            
            
            System.out.print("Enter the number of seconds: ");
            int seconds=myScanner.nextInt(); //the input of seconds you put in
            System.out.print("Enter the number of counts: ");
            int counts=myScanner.nextInt(); //the input of counts you put in
            
            distance=counts*wheelDiameter*pi; //same as below
            distance/=inchesPerFoot*feetPerMile; //declaring what distance is equal to 
            double time = (seconds/60); //calculating the time 
            double mph = (distance/(time/60)); //calculating the average speed
            
            System.out.println("The distance was " + dd.format(distance) + " miles and took " + dd.format(time) + " minutes");
            System.out.println("The avg mph was " + dd.format(mph));
        }
}