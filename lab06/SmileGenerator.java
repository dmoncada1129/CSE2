


public class SmileGenerator {
    
        public static void main (String [] args) {
            //step 1
            
            for(int i=0; i<5; i++){
                System.out.print(":)");
            }
            
            System.out.println("");
            
            //step 2
            int random =(int)(Math.random()*100)+1;
            for(int j=0; j<random; j++){
                System.out.print(":)");
            }
            
            System.out.println("");
         
            //step 3
            for(int k=0; k<random; k++){
                if(k%30==0){
                    System.out.println("");
                    System.out.print(":)");
                }
                else{
                    System.out.print(":)");
                }
                
            }
            
            //step 4
            int y = 1;
            while (y<random) {
                for(int k = 0; k<y; k++){
                System.out.print(":)");
            }
             System.out.print("");
            y++;
            
                
        }
}
}