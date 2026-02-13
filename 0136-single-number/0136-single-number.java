class Solution {
    public int singleNumber(int[] nums) {
        int h = 0;
        for(int i=0;i<nums.length;i++){
            h = h ^ nums[i];
        }
        return h;
    }
}