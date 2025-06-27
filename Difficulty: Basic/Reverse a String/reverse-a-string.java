// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        // code here
        char a[] = s.toCharArray();
        int i = 0,j = a.length-1;
        while(i<j){
            char temp = a[i];
            a[i++] = a[j];
            a[j--] = temp;
        }
        return new String(a);
    }
}