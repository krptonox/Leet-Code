class Solution {
    public int maxProduct(int[] nums) {

        
        if(nums.length == 1){
            return nums[0];
        }

        int maxProd = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            int curr = 1;

            for(int j = i; j < nums.length; j++){
                curr = curr * nums[j];
                maxProd = Math.max(maxProd, curr);
            }
        }

        return maxProd;
    }
}
