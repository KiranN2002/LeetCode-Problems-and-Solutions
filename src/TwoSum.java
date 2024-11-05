/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 */

import java.util.*;
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        int n = nums.length;
        int i,j;
        for(i=0; i<n; i++){
            for(j=i+1; j<n; j++){
                if(nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int[] res = twoSum(nums,target);

        if (res.length == 2) {
            System.out.println ( res[0] + ", " + res[1]);
        } else {
            System.out.println("No two numbers add up to the target.");
        }

        sc.close();

    }
}
