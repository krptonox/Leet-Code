//LeetCode 42. Trapping Rain Water
import java.util.*;
class Solution {
    public int trap(int[] height) {

        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for(int i=1;i<height.length;i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }

        int rightMax[] = new int [height.length];
        rightMax[height.length-1] = height[height.length-1];
        for(int j = height.length-2;j>=0;j--){
            rightMax[j] = Math.max(height[j],rightMax[j+1]);
        }

        int sum=0;
        for(int k=0;k<height.length;k++){
              sum= sum + (Math.min(leftMax[k],rightMax[k]) - height[k]);
        }
    return sum;
    }
}