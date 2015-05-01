/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author danilemoncada
 */
public class FourDWin {
    public static void main (String []args){
        
        Scanner myScanner;
        myScanner=new Scanner(System.in);
        System.out.println("please enter an Integer X: ");
        int x = input();
        System.out.println("Enter an int Y where Y>X: ");
        int y= input();
        if(y<x){
            System.out.println("Y is not greater than X, please enter again: ");
            y = input();
        }
        double [][][][] array = new double[3][][][];       
        array[0]= new double[x+(int)(Math.random()*y)][x+(int)(Math.random()*y)][x+(int)(Math.random()*y)];
        array[1]= new double[x + (int)(Math.random() * y)][x + (int)(Math.random() * y)][x + (int)(Math.random() * y)];
        array[2]= new double[x+(int)(Math.random()*y)][x+(int)(Math.random()*y)][x+(int)(Math.random()*y)];
        array=fill(array);
        System.out.print("unsorted array");
        print(array);
        statArray(array);
        double [][][][] array1;
        array1=sort4DArray(array);
        System.out.println("insertion sorted");
        print(array1);
        System.out.println("selection sorted");
        array1=sort3DArray(array);
        print(array1);
        
    }
    public static void statArray(double [][][][] list){
        double sum=0.0;
        int counter=0;
        double mean=0.0;
        for(int i=0; i<list.length; i++){
            for(int y=0; y<list[i].length; y++){
                for(int j=0; j<list[i][y].length; j++){
                    for(int b=0; b<list[i][y][j].length; b++){
                        sum +=list[i][y][j][b];
                        counter++;
                    }
                }
            }
            mean=sum/counter;
            System.out.println("The sum is "+sum);
            System.out.println("The mean is "+mean);
            System.out.println("there are "+ counter + "elements");
        }
    }
    
    public static void print(double[][][][] array){
        System.out.println(array.length);
        for(int i=0; i<array.length; i++){
            System.out.print("{ ");
            for(int b=0; b<array[i].length; b++){
                System.out.print("{ ");
                for(int j=0; j<array[i][b].length; j++){
                    System.out.print("{ ");
                    for(int y=0; y<array[i][b][j].length; y++){
                        System.out.print(array[i][b][j][y]+", ");
                    }
                    System.out.print("}, ");
                }
                System.out.print("}, ");
            }
            System.out.print("}, ");
        }
        System.out.println("");
    }
    
    public static double[][][][] fill(double [][][][] array){
        for(int i=0; i<3; i++){
            for(int j=0; j<array[i].length; j++){
                for (int q=0; q<array[i][j].length; q++){
                    for(int r=0; r<array[i][j][q].length; r++){
                        array[i][j][q][r]=(double)((int)((Math.random()*30)*10))/10;
                    }
                }
            }
        }
        return array;
    }
    
    public static int input(){
        boolean check = true;
        Scanner myScanner = new Scanner(System.in);  
        int input = 0;
        while(check){  
            if(myScanner.hasNextInt()){ 
                input = myScanner.nextInt();
                if(input<0){   
                    System.out.println("Input invalid not positive");
                }
                else{
                    check = false;
                }
            }else{
                System.out.println("invalid input not an integer");
                myScanner.next();
            }
        }
        return input;
    }
    
    public static double [][][][] sort4DArray(double[][][][] list){
        int x;
            int y;
            int b;
        for(int i=0; i<list.length-1; i++){    
            double [][][] array=list[i];
            for(x=i-1; x>=0&&array.length>list[x].length; x--){
                list[x+1]=list[x];
            }
            for(b=i-1; b>=0&&array.length>list[b].length; b--){
                list[b+1]=list[b];
            }
            list[b+1]=array;
        }
        return list;
    }
    
    public static double [][][][] sort3DArray(double [][][][] list){
        int x,y,z;
        double [][][] array;
        for(x=list.length-1; x>0; x--){
            z=0;
            for(y=1;y<=1; y++){
                if(list[y].length<list[z].length){
                    z=y;
                }
                array=list[z];
                list[z]=list[x];
                list[x]=array;
            }
            
        }
        return list;
    }
    
}
 //double int 4darray[][][][] = new int [3][][][];