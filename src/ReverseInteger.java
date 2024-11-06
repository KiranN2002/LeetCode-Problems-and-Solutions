/*
Code

7. Reverse Integer
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21 */
import java.util.*;
public class ReverseInteger {
    public static int reverse(int x) {
        int sum = 0;
        int sign;

        // Determine the sign and convert x to a positive value if necessary
        if (x < 0) {
            sign = -1;
            x = Math.abs(x);
        } else {
            sign = 1;
        }

        // Reverse the number
        while (x != 0) {
            int d = x % 10;

            // Check for overflow before updating sum
            if (sum > (Integer.MAX_VALUE - d) / 10) {
                return 0; // Return 0 in case of overflow
            }

            sum = sum * 10 + d;
            x = x / 10;
        }

        return sum * sign;
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int s1 = sc.nextInt();
        int res = reverse(s1);
        System.out.println(res);
    }
}
