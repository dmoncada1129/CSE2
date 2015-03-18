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

public class waves {
    public static void main (String [] args){
        String temp = "";   //declaring string temp
        Scanner myScanner; //making scanner
        myScanner = new Scanner(System.in); 
        System.out.print("enter a number from 1 to 30"); //declaration of printstatement
        int input = myScanner.nextInt(); //making input the scanner
        int k; //int k that is to be used later
        if (input>=1&&input<=30){ //start of whole statement 
         k=1; 
          do{                       //starting do while loop       
            if (k%2==0){            //making mod so that it is even
                int i=0;            //int i=0;
                do{                 //doing the first statement
                    temp = temp + k;        //making output for statement
                    System.out.println(temp); 
                
                i++;                //incrementing i
                }           
                while(i<k);         //while statement for do 
                temp = "";
                
            }
            else if (k%2!=0){       //making case where it is odd
                int i =0;           //making the int i=0
                do{                 
                    int j=(k-i)-1;      //making sure it decrements, starting form the numbers value amount of numbers
                    do{                 
                        System.out.print(k);
                        j--;
                    }
                    while ( j>=0);
                    //temp = temp + k;
                    System.out.print("\n");                   
                i++;
                }
                while(i<k);
            }
            k++;                    //incrementing k
           }                
          while (k<=input);         //making beginning of while statement
          k=1;              
          while (k<=input){         //while statement is exactly like do while statement, but without the do part             
            if (k%2==0){
                int i=0;
                while(i<k){
                    temp = temp + k;
                    System.out.println(temp); 
                
                i++;
                }
                temp = "";
                
            }
            else if (k%2!=0){
                int i =0;
                while(i<k){
                    int j=(k-i)-1;
                    while ( j>=0){
                        System.out.print(k);
                        j--;
                    }
                    //temp = temp + k;
                    System.out.print("\n");                   
                i++;
                }
            }
            k++;
           }
           for (k=1; k<=input; k++){              //for statements parameters
           
            if (k%2==0){                        //even 
                for (int i = 0; i<k; i++){
                    temp = temp + k;                //same as above
                    System.out.println(temp); 
                }
                temp = "";
                
            }
            else if (k%2!=0){
                for (int i = 0; i<k; i++){
                    for (int j=(k-i)-1; j>=0; j--){
                        System.out.print(k);
                        
                    }
                    //temp = temp + k;
                    System.out.print("\n");                   
                }
            }
           }
        }
        
        else {
            System.out.println("please enter a valid value");
        }
        
    }
}
