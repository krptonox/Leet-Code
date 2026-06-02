class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int sum=0;
        int msum=0;
        int mdiff=Integer.MAX_VALUE;
        for(int i =0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    sum=nums[i]+nums[j]+nums[k];
                    int diff=Math.abs(target-sum);
                    if(diff<mdiff){
                        mdiff=diff;
                        msum=sum;
                    }
                }
            }
        }
        return msum;
        
    }
}