import java.util.*;
class Main {
    
    static boolean stobochan(String value){
        HashMap<Character, Character> maps = new HashMap<>();
        
        maps.put('1','1');
        maps.put('0','0');
        maps.put('6','9');
        maps.put('9','6');
        maps.put('8','8');
        
        int left = 0;
        int right = value.length()-1;
        
        while(left<=right){
            
            if(!maps.containsKey(value.charAt(left)) || maps.getOrDefault(value.charAt(right), '-') != value.charAt(left)){
                return false;
            }
            
            left++;
            right--;
        }
        return true;
        
    }
    public static void main(String[] args){

    
}}