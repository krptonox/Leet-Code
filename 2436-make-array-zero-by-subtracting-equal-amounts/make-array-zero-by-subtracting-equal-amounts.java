class Solution {
    public int minimumOperations(int[] nums) {
        int min = Integer.MAX_VALUE;
        int count = 0;
        boolean nonZero = true;
        while(nonZero){
            nonZero = false;
            min = Integer.MAX_VALUE;
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=0){
                    nonZero = true;
                }
            }

            if (!nonZero) break; 

            for(int j=0;j<nums.length;j++){
                if(nums[j]!=0){
                  min = Math.min(min,nums[j]);
                  System.out.println(min); 
                }
            }
            for(int k=0;k<nums.length;k++){
                if(nums[k]!=0){
                    nums[k] = nums[k] - min;
                }
            }
            count++;
        }
        return count;
    }
}