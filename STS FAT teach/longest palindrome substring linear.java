// You are using Java
import java.util.*;

class Main{
    
static String longest_substring_palindrome_lineartime(String str){
    
    for(int end = str.length(); end>0 ; end--){
        for(int start = 0; start <= str.length() - end; start++){
            
            String part = str.substring(start, start + end);
            if(part.contentEquals(new StringBuilder(part).reverse())){
                return part;
            }
        }
        
    }
    return "";
}
public static void main(String[] args) {
    String str = "forgeeksskeegfor";
    System.out.println(longest_substring_palindrome_lineartime(str));
}
}