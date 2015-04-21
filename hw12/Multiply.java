
import java.util.Scanner; //importing scanner class
import java.text.DecimalFormat; //importing decimalformat class
import java.util.Random; //importing random calss
import java.lang.Math;
/**
 *
 * @author danilemoncada
 */
public class Multiply {
    public static void main (String [] args){
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        int width1; //the width of the first array
        int length1; //length of first array
        int width2; //width of second array
        int length2; //length of second array
        boolean check=true; //boolean for the while loop that validates input
        while(check){
            System.out.println("please enter a positive integer for the width of the first matrice: ");
            width1=valid(myScanner); //checking if width1 is valid
            System.out.println("please enter a positive integer for the length of the first matrice: ");
            length1=valid(myScanner); //checking if length1 is valid
            int[][] matrice1=randomMatrix(width1, length1);
            System.out.println("please enter a positive integer for the width of the second matrice: ");
            width2=valid(myScanner); 
            System.out.println("please enter a positive integer for the length of the second matrice: ");
            length2=valid(myScanner);
            int[][] matrice2=randomMatrix(width1, length1); //putting in matrice 2 into the random matrix generator
            if (width1!=length2){
                System.out.println("the width of the first matrice is not equal to the length of the second, please enter again");
                check=true; //if they are not the same lengths, loop again
            }
            else{
                check=false; //if they are the same values, break out of loop
            }
            int[][] matrice3=matrixMultiply(matrice1, matrice1);  //putting in the new array into multiply array
            printMatrix(matrice3); //printing out this new array
        }
 
    }
    public static int[][] randomMatrix(int width, int height){
        int [][] matrix=new int[width][height];
        int y=-1;
        for(int row=0; row<matrix.length; row++){ //for loop for random matrix
            for(int column=0; column<matrix[row].length; column++){
                int x=(int)(Math.random()*10); //random number that fills up containers in matrix with it, same w. below
                if(x<5){
                matrix[row][column]=(int)(Math.random()*10);
                }
                else{
                matrix[row][column]=(int)(Math.random()*10)*y;    
                }
            }
        }
        return matrix; //returning this random matrix
    }
    public static void printMatrix(int[][]array){
        for(int row=0; row<array.length; row++){
            for(int column=0; column<array[row].length; column++){
                System.out.print(array[row][column]+"");
            }
            System.out.println();
        }
        return; //print out statement
    }
    public static int[][] matrixMultiply(int[][] array1, int[][] array2){
        int harray1 = array1.length;
        int warray1 = array1[0].length;
        int harray2 = array2.length;
        int warray2 = array2[0].length; //listing down new variables for the width and length of the given arrays
        int[][]array3=new int [warray1][harray2]; //the new array
        if(warray1!=harray2){
            return null;
        }
        else{
            for (int i=0; i<harray1; ++i)
                for (int j=0; j<warray2; ++j)
                  for (int k=0; k<warray1; ++k)
                    array3[i][k] += array1[i][k] * array2[k][j];  
                    return array3; //for loop that goes through and multiplies each array
        }
        
        
    }
    public static int valid(Scanner input){
        while(true){
             while(!input.hasNextInt()){
                 System.out.println("please enter an integer");
                 input.next(); //resetting scanner
                 continue;
             }
             int validInput=input.nextInt();
             if(validInput>0){
                 return validInput; //checks if valid input
             }
             else{
                 System.out.println("please enter only a positive int");
             }
            }   
    }
}
