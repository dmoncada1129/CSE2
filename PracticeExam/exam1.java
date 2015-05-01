public class exam1 {
    public static void main (String [] args){
        int k=5, j=15;
        if(k%3>j%5){
            if(k<j*j){
                k++;
                j++;
            }
            else{
                k/=3;
            }
        }
        else{
            k/=2;
        }
        //k=6;
        //j=16;
        System.out.println(j+" "+k);
        //16 6
}
}