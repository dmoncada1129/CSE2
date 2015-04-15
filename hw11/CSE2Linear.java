/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner; //importing scanner class
import java.text.DecimalFormat; //importing decimalformat class
import java.util.Random; //importing random calss
import java.lang.Math;

public class CSE2Linear {
     public static void main(String args[]){ //declare main method
        Scanner myScanner = new Scanner(System.in);  //declare scanner
        System.out.println("Please enter 15 final grades");//ask for inputs
        int[] grades = new int[15];  //create array size 15
        for(int i = 0; i < 15; i++){
            if(myScanner.hasNextInt()){ 
                int y = myScanner.nextInt();
                if(y < 0 || y > 100){   //check if input is in bounds
                    System.out.println("not a valid value");
                    i--;
                }
                else{
                    if(i==0 || (y >= grades[i-1])){  //if it's more than the previous container
                        grades[i] = y;      
                    }
                    else{
                        System.out.println("score is not higher than previous input");
                        i--;
                    }
                }
            }
            else{
                System.out.println("input was not an integer"); //self explanatory
                i--;
                myScanner.next();        
            }
        }
        for(int i = 0; i < 15; i++){ 
            System.out.print(" " + grades[i]); //just printing out the array
        }
        System.out.println("");
        boolean check = true; //boolean to make sure while loop runs
        while(check){  
            System.out.println("Enter a grade to search for"); 
            if(myScanner.hasNextInt()){
                int input = myScanner.nextInt();
                binarySearch(grades,input);    //calling binarysearch method
                check = false;  //making the whle loop end if this is fulfilled
            }
            else{
                System.out.println("Please enter an integer"); 
                myScanner.next();//reentering scanner so that when the while loop runs again scanner is still a valid input
            }
        }
        Scramble(grades);    //method scramble
    }
    public static void Scramble(int[] list){
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        int [] scrambled =new int[15]; //new arrays amount of containers
        int count=0;
        int low=0;
        int high=15;
        for(int i=0; i<scrambled.length; i++){
            int random=(int)(Math.random()*15); //makes the containers in array random numbers
            if (scrambled[random]==0){
                scrambled[random]=list[i]; //copies array onto another container if the cell is null
            }
            else {
                i--;
            } //restarts
        }
        for(int x=0; x<scrambled.length; x++){
            System.out.print(" "+scrambled[x]);
        }
        boolean check=true;
        int j=0;
        while(check){
            System.out.println("enter a grade to be searched");
        
        if(myScanner.hasNextInt()){
            j=myScanner.nextInt();
            check=false;
        }
        else{
            System.out.println("please enter an integer");
            myScanner.next();
        }
        /**public static int linearSearch(int[] list, int key){
        for (int i=0; i<list.length; i++){
            if(key==list[i])
                return i;
        }
        return -1;
    }   *///
        }
        boolean check1=true;
        boolean check2=false;
        int counter=0;
        while(check1){
            for(int y=0; y<15; y++){
                counter++;
                if(j==scrambled[y]){
                    check2=true;
                    check1=false;
                    break;
                }
            }
        }
        if(check1){
            System.out.println("found "+j+"with "+counter+"iterations");
        }
        else{
            System.out.println("did not find "+j+"with "+counter+"iterations");
        }
        return;
    }
    
    public static void binarySearch (int[] list, int key){
        int low=0; //variable for the lower limit
        int high=list.length-1; //variable for the upper limit
        int counter=0; //counter for iterations
        boolean check=true;
        while (high>=low){ 
                counter++;
            int mid=(int)((low+high)/2); // the middle point is the low and high divided by two, and this changes if there input is not found
            if (list[mid]==key){
                check=false;
                break;
                }
            else if(list[mid]>key){ //changing the vairables when the input is not found
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            if(!check){
                System.out.println("found "+key+"with "+counter+"iterations");
            }
            else{
                System.out.println("did not find "+key+"with "+counter+"iterations");
            }
        }
        return;
    }
}
