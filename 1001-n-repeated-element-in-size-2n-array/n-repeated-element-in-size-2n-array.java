class Solution {
    public int repeatedNTimes(int[] nums) {
        Arrays.sort(nums);
        int lst[] = new int[50000];
        int s = 0;
        System.out.println(lst);
        for(int i=0;i<nums.length;i++){
            lst[nums[i]]++;
        }
        for(int i=0;i<lst.length;i++){
            if(lst[i]>1){
                return i;
            }
        }
        return -1;
    }
}