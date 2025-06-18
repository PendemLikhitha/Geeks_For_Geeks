class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        if(s1.length()!=s2.length())return false;
        int a[] = new int[26];
        for(int i = 0; i<s1.length(); i++){
            a[s1.charAt(i)-'a']++;
            a[s2.charAt(i)-'a']--;
        }
        
        for(int i:a){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}