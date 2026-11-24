// unique sorted permutations
import java.util.*;
class Main{
    static void combine(int[] nums, int start, int size, ArrayList<Integer> selected){
        if(selected.size()==size){
            System.out.println(selected);
            return;
        }
        
        for(int index = start; index < nums.length; index++){
            if(index > start && nums[index]==nums[index-1]){
                continue;
            }
            selected.add(nums[index]);
            combine(nums, index+1, size, selected);
            selected.remove(selected.size()-1);
        }
    }

public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
    int r = 3;

    combine(a, 0, r, new ArrayList<>());
}
    
}
