//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Reading total number of testcases
        int t = sc.nextInt();

        while (t-- > 0) {
            // reading the string
            String st = sc.next();

            // calling ispar method of Paranthesis class
            // and printing "balanced" if it returns true
            // else printing "not balanced"
            if (new Solution().isParenthesisBalanced(st) == true)
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends



class Solution {
    // Function to check if brackets are balanced or not.
    static boolean isParenthesisBalanced(String s) {
        Stack<Character> res = new Stack<>();
        for(char i:s.toCharArray()){
            if(i=='('||i=='{'||i=='['){
                res.push(i);
            }
            else if(i==')'||i=='}'||i==']'){
                if(res.isEmpty()){
                    return false;
                }
                char top = res.pop();
                if((top!='(' && i==')')||(top!='{' && i=='}')||(top!='[' && i==']')){
                    return false;
                }
            }
        }
        return res.isEmpty();
    }
}
