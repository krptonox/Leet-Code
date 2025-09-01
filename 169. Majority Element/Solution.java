class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int x = nums[nums.length/2];

        System.out.println(x);
        return nums[nums.length/2];
    }
}