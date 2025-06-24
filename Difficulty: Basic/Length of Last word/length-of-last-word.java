// User function Template for Java
class Solution {
    int findLength(String s) {
        // code here
        int i = s.length()-1;
        while(i>=0 && s.charAt(i)==' ')
        i--;
        int lastIndex = i;
        while(i>=0 && s.charAt(i)!= ' '){
            i--;
        }
        return lastIndex - i;
    }
}