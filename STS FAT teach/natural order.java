// You are using Java
import java.util.*;

class Main{
public static void main(String[] args){
    String[] files = {"file10.txt", "file21.txt", "file20.txt"};
    
    Arrays.sort(files, Comparator.comparingInt(s -> Integer.parseInt(s.replaceAll("\\D",""))));
    
    System.out.println(Arrays.toString(files));
    
}
}