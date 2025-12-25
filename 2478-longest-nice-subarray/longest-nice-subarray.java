class Solution {
    public int longestNiceSubarray(int[] nums) {
        int usedBits = 0;  
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < nums.length; right++) {
            while ((usedBits & nums[right]) != 0) {
                usedBits ^= nums[left];
                left++;
            }
            usedBits |= nums[right];

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
