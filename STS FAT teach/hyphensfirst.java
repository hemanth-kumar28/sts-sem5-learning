// You are using Java
import java.util.*;

class Main{
    
static String firsthyphen(String str){
    
    String onlyletters = str.replace("-", "");
    return "-".repeat(str.length() - onlyletters.length()) + onlyletters;
    
}
public static void main(String[] args){
    
    System.out.println(firsthyphen("a--b-c--d"));
}
}