class Solution {
    public int maximumProduct(int[] nums) {
       int num1 = 0;
       int num2 = 0;
       Arrays.sort(nums);
       num1 = nums[0]*nums[1]*nums[nums.length-1];
       num2 = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
       int ans = 0;
       ans = Math.max(num1,num2);
       return ans; 
    }
}