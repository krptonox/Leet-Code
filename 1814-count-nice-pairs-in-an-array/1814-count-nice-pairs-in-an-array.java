class Solution {
    public int countNicePairs(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        long count = 0;
        int MOD = 1_000_000_007;
        for(int i=0;i<nums.length;i++){
           int check = nums[i] - rev(nums[i]);
           count = (count + map.getOrDefault(check,0)) % MOD;
           map.put(check,map.getOrDefault(check,0)+1);
        }
        // for(int j=0;j<nums.length;j++){
        //    count+=map.getOrDefault(nums[j] - rev(nums[j]),0);
        // }
        return (int)count;
    }
      public int rev(int num){
        int ans = 0;
        while(num>0){
            int rev = num%10;
            ans = ans*10 + rev;
            num=num/10;
        }
        return ans;
    }
}