class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count = 0;
       for(int i=0;i<nums.length;i++){
        int let = nums[i];
        while(let > 0){
            int chk = let % 10;
            if(chk == digit){
                count++;
            }
            let = let / 10;
        }
       }
       return count;
    }
}