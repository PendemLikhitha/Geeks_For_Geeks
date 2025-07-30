class Solution {
    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        res.add(arr[0]);
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i] != arr[i+1]){
                res.add(arr[i+1]);
            }
        }
        return res;
    }
}
