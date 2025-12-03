class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int curS = 0;
        int maxS = 0;
        int left = 0;
        for(int right = 0;right<nums.length;right++){
    
            while(set.contains(nums[right])){
                set.remove(nums[left]);
                curS = curS - nums[left];
                left++;
            }
            set.add(nums[right]);
            curS = curS + nums[right];
            maxS = Math.max(curS,maxS);
        }
        return maxS;
    }
}