import java.util.*;
import java.math.*;
class Main{
    
    
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    
    int length = scan.nextInt();
    
    //must use only non-primitive data type
    Integer[] arr = new Integer[length];
    for(int i =0; i < length; i++){
        arr[i] = Integer.valueOf(scan.nextInt());
    }
    
    //must give only as list date type
    Collections.rotate(Arrays.asList(arr), -2); //rotating left(negetive)
    
    System.out.println(Arrays.toString(arr));
    
}
    
    
}