import java.util.*;
class Main {
    //leaders in array
    public static void main(String[] args){

    int n = 97;
    boolean[] prime = new boolean[n+1];
    
    Arrays.fill(prime, true);
    prime[0] = false;
    prime[1] = false;
    
    for(int i = 2; i <= n/i; i++){
        if(!prime[i]){
            continue;
        }
        for(int j = i*i; j <= n; j+=i){
            prime[j] = false;
        }
    }
}}