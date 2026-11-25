import java.util.*;
import java.math.*;
class Main{
    
    
    public static void main(String[] args) {

    int value = 34;
    
    int lower = (value & 0x0F) << 4;
    int higher = (value & 0xF0) >>> 4;
    
    System.out.println((higher + lower));
    
}
    
    
}