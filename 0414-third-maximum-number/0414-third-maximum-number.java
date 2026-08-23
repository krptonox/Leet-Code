class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int max = nums[nums.length - 1];
        int count = 1;

           for(int i=nums.length - 2;i>=0;i--){
               if(max > nums[i]){
                max = nums[i];
                count++;
                }
           
                if(count == 3){
                return max;
                }
            }

        return nums[nums.length - 1];
    }
}