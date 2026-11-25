import java.util.*;
class Main {
    //leaders in array
    public static void main(String[] args){
        
    String s = "aaffffggggttuuuubbbbddd";
    int[] freq = new int[26];
    for(int i = 0; i < s.length(); i++){
        freq[s.charAt(i) - 'a']++;
    }
    
    int odd = 0;
    String middle = "";
    //or use 
    //char middle = '\0';
    for(int i = 0; i < 26; i++){
        if(freq[i]%2==1){
            odd++;
            middle = String.valueOf((char)(i + 97));
        }
    }
    if(odd > 1){
        System.out.println("cant form palindrome");
        return;
    }
    
    StringBuilder str = new StringBuilder();
    for(int i = 0; i < 26; i++){
        for(int j = 0; j < freq[i]/2; j++){
            str.append((char)(i + 'a'));
        }
    }
    
    System.out.println(str.toString() + middle + str.reverse());
    
}}