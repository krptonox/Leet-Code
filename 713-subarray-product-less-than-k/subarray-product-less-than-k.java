class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int si =  0;
        int ei =  0;
        int pr = 1;
        int ans = 0;
        if(k<=1) return 0 ;
            while(ei<nums.length){
                pr = pr * nums[ei];
              while(pr>=k){
                pr = pr / nums[si];
                si++;  
              }
              ans = ans + (ei - si + 1);
              ei++;
            }
        return ans;
        }
    }