class Solution {
    public int mostFrequentEven(int[] nums) {
        int count = 0;
        int max = -1;
        int ans = 0;
        if(nums.length==1){
            if(nums[0]%2==0){
              return nums[0];
            }
            else{
                return -1;
            }
        }
        else{
        for(int i=0;i<nums.length;i++){

           if (nums[i] % 2 != 0) continue;
           count=0;

           for(int j=0;j<nums.length;j++){
            if(nums[i]==nums[j]){
                count++;
            }
          }

          if(count>max){
                max = count;
                ans = nums[i];
                }
            else if(count == max){
                ans = Math.min(ans,nums[i]);
            }
        }
        if(max==-1){
            return -1;
         }
        }
        return ans;
    }
}