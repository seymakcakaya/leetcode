package org.example.valid.parentheses;

import java.util.Stack;

//20. Valid Parentheses
public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> st=new Stack<Character>();
        for(int i=0;i<s.length();i++){

            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                st.push(s.charAt(i));
            }

            if(st.empty()){
                return false;
            }
            // Check for the close brackets pair on the top and pop them
            else if (st.peek() == '{' && s.charAt(i) == '}' ) {
                st.pop();
            } else if (st.peek() == '(' && s.charAt(i) == ')' ) {
                st.pop();
            } else if (st.peek() == '[' && s.charAt(i) == ']' ) {
                st.pop();
            }else{
                return false;
            }
        }


        return st.isEmpty();
    }
}
