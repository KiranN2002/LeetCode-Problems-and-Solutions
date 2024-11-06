/*

Code
Testcase
Test Result
Test Result
20. Valid Parentheses
Solved
Easy
Topics
Companies
Hint
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true


 */

import java.util.*;
public class ValidParantheses {
    public static char getVal(char ch){
        switch(ch){
            case ']': return '[';
            case '}': return '{';
            case ')': return '(';
            default : return ' ';
        }
}
    public static boolean isValid(String s) {
        String open = "({[";
        String close= "]})";
        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray()){
            if(open.indexOf(ch)!=-1)
                st.push(ch);
            else
            {
                if(st.size()==0) return false;
                char tmp = st.pop();
                if(getVal(ch) != tmp)
                    return false;
            }
        }
        return st.size() == 0;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean res = isValid(s);
        if(res){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}