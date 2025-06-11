// User function Template for Java
import java.util.*;
class Solution {
    public int firstNonRepeating(int[] arr) {
        // Complete the function
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i:arr){
            h.put(i,h.getOrDefault(i,0)+1);
        }
        for(int i:arr){
            if(h.get(i)==1){
                return i;
            }
        }
    return 0;
    }
}
