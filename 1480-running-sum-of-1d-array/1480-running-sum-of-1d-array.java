class Solution {
    public int[] runningSum(int[] nums) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[nums.length];
        prefix[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i] = prefix[i-1]+nums[i];
        }

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                currsum = i==0 ? prefix[j]: prefix[j]-prefix[i-1];
                if(currsum>maxsum){
                    maxsum=currsum;
                }
            }
        }
        return prefix;
    }
}