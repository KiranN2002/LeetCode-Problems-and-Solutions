/*
9. Palindrome Number

Hint
Given an integer x, return true if x is a
palindrome
, and false otherwise.


Example 1:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

Example 2:
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

Example 3:
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.*/

import java.util.*;
public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        int sum=0;
        int r;
        if (x < 0) {
            return false;
        }
        int t=x;
        while(t!=0){
            r=t%10;
            sum=sum*10+r;
            t=t/10;
        }
        if(sum==x){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int num1 = sc.nextInt();
        if(isPalindrome(num1)){
            System.out.println("Number is palindrome");
        }
        else{
            System.out.println("Number is not palindrome");
        }
    }
}
