import java.util.Scanner; //importing scanner class
import java.text.DecimalFormat; //importing decimalformat class
import java.util.Random; //importing random calss
import java.lang.Math;
public class RemoveElements{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
int num[]=new int[10];
int newArray1[];
int newArray2[];
int index,target;
	String answer="";
	do{
  	System.out.print("Random input 10 ints [0-9]");
  	num = randomInput();
  	String out = "The original array is:";
  	out += listArray(num);
  	System.out.println(out);
 
  	System.out.print("Enter the index ");
  	index = scan.nextInt();
  	newArray1 = delete(num,index);
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
 
      System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(num,target);
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
  	 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }
 
  public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  	if(j>0){
    	out+=", ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;
  }
  
  public static int[] remove(int [] list, int target){
      int x=0;
       //declaring a seperate array because my new array is out of scope to be returned
      for(int j=0; j<list.length; j++){ //j is less than the lenth
            if(list[j]==target){
               x++;
            }
      }
        int j=0;
        int list2[]=new int[list.length-x]; //initializing another list to be equal to length-x that i set above
        for(int i=0; i<list.length; i++){ 
            if (list[i]==target&&i!=list.length-1){
                i++;
            }
            else if(list[i]==target&&i==list.length-1){
                break;
            }
            list2[j]=list[i];//setting my new array equal to the value of the old one; retaining values   
            j++;        
            
        }
        return list2;
    }
      
  
  
  public static int[] delete(int[] list, int pos){
      int list2[]=new int[list.length-1];      
      int x=0;
      if(pos>=0&&pos<list.length){ //setting the length of the new array to 1 less than the old array
          for(int i=0; i<list2.length; i++){
              if(x==pos){ //setting x=pos so that it may run until that position is removed
                  x++; //incrementing x
                  i--; //decrementing i
              }
              else{
                  list2[i]=list[x]; //setting the value of i in list2 equal to the corresponding value in listof x
                  x++; //incrementing x
              }
          }return list2;
      }
      else{
          return list;
      }
  }
  
  public static int[] randomInput(){
      int rand[]=new int[10]; //initializing the int
        for (int i=0; i<rand.length; i++){  //for parameters
            rand[i]=(int)((Math.random()*10)+1);           //setting array values equal to random ##s
        }
       return rand;
  }
}
 