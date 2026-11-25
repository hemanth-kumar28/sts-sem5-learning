import java.util.*;
import java.math.*;
class Main{
    
    static int gcd(int a, int b){
        
        if(b==0){
            return a;
        }
        
        return gcd(b, a % b);
        
    }
    
    public static void main(String[] args) {
    // BigInteger a = new BigInteger.valueOf(23);
    // BigInteger b = new BigInteger.valueOf(4);
    
    System.out.println(gcd(2435,452));
}
    
    
}