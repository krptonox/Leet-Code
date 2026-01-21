class Solution {
    public void sortColors(int[] nums) {
       int strt = 0;
       int mid = 0;
       int end = nums.length - 1;
       while(mid<=end){
        if(nums[mid] == 0){
            swap(nums,mid,strt);
            mid++;
            strt++;
        } 
            else if(nums[mid] == 2){
                swap(nums,mid,end);
                end--;
            }
            else{
                mid++;
            }
    
       }
    }
       public void swap(int[] nums, int fst, int snd){
         int temp = nums[fst];
         nums[fst] = nums[snd];
         nums[snd] = temp;
       }
}