class Solution {
    public int is_valid(String s) {
        // code here
        int n= s.length();
        if(n < 10 || n>12){
            return 0;
        }
        if(n==10){
            if("789".indexOf(s.charAt(0))==-1){
                return 0;
            }
        }
        else if(n == 11){
            if(s.charAt(0) == '0'){
                return is_valid(s.substring(1,n));
            }
            else{
                return 0;
            }
        }
        else{
            if(s.substring(0,2).equals("91")){
                return is_valid(s.substring(2,n));
            }
            else{
                return 0;
            }
        }
        return 1;
    }
}