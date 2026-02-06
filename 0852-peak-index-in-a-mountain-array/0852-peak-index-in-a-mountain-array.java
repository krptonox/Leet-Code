class Solution {
    public int peakIndexInMountainArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
                if(nums[i]==max){
                    index = i;
                }
            }
        }
        return index;
    }
}