class Solution {
    public int missingInteger(int[] nums) {
        int ans = nums[0], max = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i-1] == nums[i]-1){
                max += nums[i];
            }
            else {max = 0; break;}

            ans = Math.max(ans,max);
        
        }
        return check(ans,nums);
    }
    public int check(int ans,int nums[]){
        int fans = ans;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==ans){
                fans = check(ans+1,nums);
            }
        }
        return fans;
    }
}