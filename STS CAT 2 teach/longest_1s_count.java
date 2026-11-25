import java.util.*;
import java.math.*;
class Main{
    
    static int longest_number_of_ones_after_flipping_k_zeros(int[] bits, int k){
        int left = 0;
        int best = 0;
        int zeros = 0;
        for(int right = 0; right < bits.length; right++){
            if(bits[right]==0){
                zeros++;
            }
            
            while(zeros > k){
                if(bits[left]==0){
                    zeros--;
                }
                left++;
            }
            
            best = Math.max(right - left + 1, best);
        }
        
        return best;
    }
    public static void main(String[] args) {

    String str = "10101001001100100";
    //int[] arr = Arrays.stream(str.split("")).mapToInt(Integer::parseInt).toArray();
    
    // or use 
    int [] arr = str.chars().map(ch -> ch - '0').toArray();
    System.out.println(longest_number_of_ones_after_flipping_k_zeros(arr,3));
}
    
    
}