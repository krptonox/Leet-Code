
class Solution {

    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return count(nums, upper) - count(nums, lower - 1);
    }
    public long count(int[] nums, int target) {

        long ans = 0;
        int left = 0;
        int right = nums.length - 1;

        while(left < right) {
            if(nums[left] + nums[right] <= target) {
                ans += (right - left);
                left++;
            }
            else {
                right--;
            }
        }

        return ans;
    }
}