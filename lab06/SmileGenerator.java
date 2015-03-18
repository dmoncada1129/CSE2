/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danilemoncada
 */
import java.lang.Math;

public class SmileGenerator {
    public static void main (String [] args){
        int x=0;
        int y = (int)(Math.random()*100+1);
        int step3 = (int)(Math.random()*100+1);
        //step 1
        for (int n=0; n<5; n++){
            System.out.print(":)");
        }
        System.out.println("");
        //step 2
        for (int g = y; g>0; g--){
            System.out.print(":)");
        }
        System.out.println("");
        //step 3
        for (int z = 30; z>0; z-- ){
            System.out.print(":)");
        }
        System.out.println("");
        //step 4
        String temp = "";
        for (int i = 0; i<4; i++){
            temp = temp + ":)";
            System.out.println(temp);
        }
        
        
    }
}

