class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        boolean[] arr = new boolean[len + 1];
        for(int i=0;i<len;i++){
            if(nums[i]>0 && nums[i]<=len){
                arr[nums[i]] = true;
            }
        }

        for(int i=1;i<=len;i++){
            if(arr[i]!=true){
                return i;
            }
        }

        return len + 1;
    }
}