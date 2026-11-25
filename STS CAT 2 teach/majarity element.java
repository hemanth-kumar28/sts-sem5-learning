import java.util.*;
class Main {
    //leaders in array
    public static void main(String[] args){
        
    Scanner scan = new Scanner(System.in);
    
    int length = scan.nextInt();
    
    //must use only non-primitive data type
    Integer[] arrs = new Integer[length];
    for(int i =length-1; i >=0 ; i--){
        arrs[i] = Integer.valueOf(scan.nextInt());
    }
    
    int[] arr = {2, 2, 1, 1, 1, 2, 2, 3, 2};
    
    int candidate = arr[0];
    int votes = 0;
    
    for(int value : arr){
        
        if(votes == 0){
            candidate = value;
            votes = 1;
            continue;
        }
        if(value == candidate){
            votes++;
        } else {
            votes --;
        }
        
    }
    
    System.out.println(candidate);
    System.out.println(votes);
    
    
    }
    
}