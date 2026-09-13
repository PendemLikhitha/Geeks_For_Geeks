class Solution {
    public void sort012(int[] arr) {
        // code here
        int left = 0,mid = 0,high = arr.length -1 ;
        while(mid <= high){
            if(arr[mid] == 0){
                swap(arr, left, mid);
                left++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr,high,mid);
                high--;
            }
        }
    }
    public void swap(int[] nums,int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}