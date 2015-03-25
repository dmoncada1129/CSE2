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
import java.util.logging.Logger;
import java.util.Random;
import java.lang.Math;

public class HW8 {
    public static void main(String[] args) {
        char option;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = getInput(scan, "Cc");
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave();
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant();
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
        input = getInput(scan, "AaEe", 10);
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
        box();
        input = getInput(scan);
        System.out.println("Hero! Have a good day!");
    }
    public static String getInput(Scanner scan, String string){
         String input = scan.next();
         if (input.equals("C")||input.equals("c")){
             return input;
         }
         else {
             System.out.println("Yeah right LOSER!");
             System.exit(0);
         }
         
         return input;
    }
    public static String getInput(Scanner scan, String string, int trial){
        String input = scan.next();
        int x=0;
        int e=1;
        trial=0;   
        boolean check=true;
        while(trial<10&&check){
            
        if (input.equals("A")||input.equals("a")){
            
                
                Random rand=new Random();
                x=rand.nextInt(2);
                System.out.println("You attacked the giant!");
                if (x==0){
                    System.out.println("you got a critical hit");
                    trial++;
                    
                }
               
                else{
                    System.out.println("no critical hit! try again");
                    
                }  
        }
        else if (input.equals("E")||input.equals("e")){
            x=(int)(Math.random()*10);
            
            if(x==10){
                System.out.println("you've escaped successfully!");
                check=false;
            }
            
        }
        else{
            System.out.println("You've been executed by the giant! Game over!");
            System.exit(0);
            
        }
        if (trial<10&&check){
            System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
            input=scan.next();
        }
        }   
    
        return input;
    }
    public static String getInput(Scanner scan){
        int input = Integer.parseInt(scan.next());
        if(input==1||input==2||input==3){
            switch (input){
                case(1):
                    System.out.println("you get 1 gold");
                    break;
                case(2):
                    System.out.println("you get 2 gold");
                    break;
                case(3):
                    System.out.println("you get 3 gold");
                    break;
                default:
                    System.out.println("A wrong number! You get nothing, better restart the game LOL");                
            }
           
        }
        return String.valueOf(input);        
    }

    public static void giant() {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    }

    public static void cave() {
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }
    
    public static void box(){
       System.out.println("                      *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
    }

   
   
   
       
}
