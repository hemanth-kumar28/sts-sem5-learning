import java.util.*;
import java.math.*;
class Main{
    
    static long karatsuba(long x, long y){
        
        if(x<10 || y<10){
            return x * y;
        }
        
        int length = Math.max(Long.toString(x).length(), Long.toString(y).length());
        int base = (int) Math.pow(10, (int) length/2);
        
        int a = x / base;
        int b = x % base;
        int c = y / base;
        int d = y % base;
        
        long z0 = karatsuba(a , c);
        long z1 = karatsuba(a + c, b + d);
        long z2 = karatsuba(b , d);
        
        return (long) z0 * base * base + (z1 - z0 - z2) * base + z2;
        
        
    }
    public static void main(String[] args) {

    
    System.out.println(karatsuba(2435,452));
}
    
    
}