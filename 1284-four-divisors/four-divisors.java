class Solution {
    public int sumFourDivisors(int[] nums) {
        long finalsum = 0;
        for(int i=0;i<nums.length;i++){
           long sum = 0;
           long count = 0;
           long no = nums[i];
            for(int j=1;j*j<=no;j++){
               if(no % j == 0){
                long other = no / j;
                count++;
                sum = sum + j;
                if(other != j){
                    count++;
                    sum = sum + other;
                }
                if(count>4) break;
               }
            }
               if(count == 4){
                finalsum = finalsum + sum;
               }
       }
        int FinalSum = (int) finalsum;
        return FinalSum;
    }
}