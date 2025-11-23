class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int linear_sum = kadan(nums);
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
            nums[i] = nums[i] * -1;
        }
        int mid = kadan(nums);

        System.out.println(mid);
        System.out.println(sum);

        int circular_Sum = mid + sum;

        if(circular_Sum == 0){
            return linear_sum;
        }
        System.out.println(circular_Sum);
        return Math.max(linear_sum,circular_Sum);
    }

    public static int kadan(int[] nums){
        int cs = nums[0];
        int ms = nums[0];

        for(int i = 1; i < nums.length; i++){
            cs = Math.max(nums[i], cs + nums[i]);
            ms = Math.max(ms, cs);
        }

        return ms;
    }

}