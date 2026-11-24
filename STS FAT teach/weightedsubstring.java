// You are using Java
import java.util.*;

class Main{
    
static int weightedsubstring(String p, String q, int k){
    Set<String> seen = new HashSet<>();
    
    for(int start = 0; start< p.length(); start++){
        
        int weight = 0;
        
        for(int end = start; end < p.length(); end++){
            
            int letter = p.charAt(end) - 'a';
            weight+= q.charAt(letter) - '0';
            if(weight>k) seen.add(p.substring(start , end+1));
        }

        
    }
    return seen.size();
    
}
    
public static void main(String[] args) {
    String p = "abacabadabacaba";
    String q = "12345678912345678912345678";
    int k = 10;

    System.out.println(weightedsubstring(p, q, k));
}



}