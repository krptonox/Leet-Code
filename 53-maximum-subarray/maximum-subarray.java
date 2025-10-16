class Solution {
    public int maxSubArray(int[] nums) {
      int lastMax = 0;
      int MaxOf = nums[0];
      for(int i=0;i<nums.length;i++){
        lastMax = Math.max(nums[i] , lastMax + nums[i]);
        MaxOf = Math.max(lastMax , MaxOf);
      }
        return MaxOf;
    }
}