// LeetCode 1. Two Sum Solution in Java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i+1;j<nums.length;j++){
                 sum=nums[i]+nums[j];
                 if(sum==target){
                     return new int[]{i, j};
                 }
                 else{
                    continue;
                 }
            }
        }
    return new int[0];
    }
}