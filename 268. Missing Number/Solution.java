//Leetcode 268. Missing Number
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                k=i;
                break;
            }
        }
  
        if(nums[0]!=0){
            return 0;
        }
        if(k==0){
            return nums.length;
        }
        return k;

    }
}