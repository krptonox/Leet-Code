class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double maxSum = sum;
        int r = k;
        int n = nums.length;
        int l = 0;
        while(r<n){
           sum = sum - nums[l];
           l++;
           sum = sum + nums[r];
           r++;
           maxSum = Math.max(maxSum,sum);
        }
        return maxSum/k;
    }
}