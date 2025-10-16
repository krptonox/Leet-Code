class Solution {
    public int missingNumber(int[] nums) {
        // Arrays.sort(nums);
        // int k=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]!=i){
        //         k=i;
        //         break;
        //     }
        // }
        // if(nums[0]!=0){
        //     return 0;
        // }
        // if(k==0){
        //     return nums.length;
        // }
        // return k;
        Arrays.sort(nums);
        int sum=0;
        int x = nums.length;
        for(int i=0;i<x;i++){
            sum+=nums[i];
        }
        int sum1 = x*(x+1)/2;
        System.out.print(sum1);
        if(nums[0]!=0){
            return 0;
        }
        if(sum1-sum==0){
            return x;
        }
        if(sum != sum1){
            return sum1-sum;
        }
        return -1;
    }
}