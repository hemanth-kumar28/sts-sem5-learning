import java.util.*;
import java.math.*;
class Main{
    
    
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    
    int length = scan.nextInt();
    
    
    int[] arr = new int[length];
    for(int i =0; i < length; i++){
        arr[i] = Integer.valueOf(scan.nextInt());
    }
    
   int best = arr[0];
   int low = arr[0];
   int high = arr[0];
   
   for(int i = 1; i < length; i++){
       
       int x = arr[i];
       int extendHigh = high *x;
       int extendLow = low * x;
       
        high = Math.max(x, Math.max(extendLow, extendHigh));
        low = Math.min(x, Math.min(extendHigh, extendLow));
        best = Math.max(best, high);
       
       
   }
    
    System.out.println(best);

}
    
    
}