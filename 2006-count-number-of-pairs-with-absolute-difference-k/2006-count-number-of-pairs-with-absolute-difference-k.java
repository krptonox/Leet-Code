class Solution {
    public int countKDifference(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff = nums[i]-k;
            map.put(diff,map.getOrDefault(diff,0)+1);
        }
        int count = 0;
        for(int i=0;i<nums.length;i++){
            count+=map.getOrDefault(nums[i],0);
        }
        return count;
    }
}