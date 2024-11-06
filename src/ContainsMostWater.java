/*11. Container With Most Water
Solved
Medium
Topics
Companies
Hint
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.


Example 1:
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

Example 2:
Input: height = [1,1]
Output: 1
*/
import java.util.*;
public class ContainsMostWater {
    public static int maxArea(int[] height) {
        int start =0;
        int end = height.length -1;
        int maxcap = 0;

        while(start<end){
            int h = Math.min(height[start], height[end]);
            int width = end-start;
            int cap = h * width;
            maxcap  = Math.max(cap,maxcap);

            if(height[start] < height[end]){
                start++;
            }
            else{
                end--;
            }
        }
        return maxcap;
    }

    public static void main(String args[]){
       Scanner sc= new Scanner(System.in);
       int n = sc.nextInt();
       int[] height = new int[n];
       for(int i=0; i<n; i++){
           height[i] = sc.nextInt();
       }
       int res = maxArea(height);
       System.out.println(res);
    }
}
