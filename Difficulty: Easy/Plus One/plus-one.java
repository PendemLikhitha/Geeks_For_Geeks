// User function Template for Java

class Solution {
    static ArrayList<Integer> increment(ArrayList<Integer> arr, int N) {
        // code here
        for(int i=N-1;i>=0;i--){
            if(arr.get(i)<9){
                arr.set(i,arr.get(i)+1);
                return arr;
            }
            arr.set(i,0);
        }
        ArrayList<Integer> res = new ArrayList<>();
        res.add(1);
        for(int i:arr){
            res.add(0);
        }
        return res;
    }
};