import java.util.*;
class Main {
    //leaders in array
    public static void main(String[] args){
        
    Scanner scan = new Scanner(System.in);
    
    int length = scan.nextInt();
    
    //must use only non-primitive data type
    Integer[] arr = new Integer[length];
    for(int i =length-1; i >=0 ; i--){
        arr[i] = Integer.valueOf(scan.nextInt());
    }
    
    ArrayList<Integer> list = new ArrayList<>();
    int largest = Integer.MIN_VALUE;
    for(int i = 0; i < arr.length; i++){
        int value = arr[i];
        if(value >= largest){
            list.add(value);
            largest = value;
        }
    }
    Collections.reverse(list);
    System.out.println(list.toString());
    }
    
}