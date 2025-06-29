// User function template for Java

class Solution {
    static String toLower(String s) {
        // code here
        StringBuilder r = new StringBuilder();
        for(char i : s.toCharArray()){
            if(i >= 'A' &&  i<='Z'){
                r.append((char)(i+32));
            }
            else{
                r.append(i);
            }
        }
        return r.toString();
    }
}