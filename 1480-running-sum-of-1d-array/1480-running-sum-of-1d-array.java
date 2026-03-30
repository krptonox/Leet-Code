class Solution {
    public int[] runningSum(int[] nums) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int Prefix[] = new int[nums.length];
        Prefix[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            Prefix[i] = Prefix[i-1]+nums[i];
        }
        return Prefix;
    }
}