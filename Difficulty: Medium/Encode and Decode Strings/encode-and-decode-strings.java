class Solution {

    public String encode(String s[]) {
        // write your logic to encode the strings
        String res = "";
        for(String i :s){
           String j = i+"#";
           res +=j;
        }
        return res;
    }

    public String[] decode(String s) {
        // write your logic to decode the string
        String res[] = s.split("#");
        
        return res;
    }
}