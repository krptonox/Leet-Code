class Solution {
    public int minimumDeletions(int[] nums) {
        int max = Integer.MIN_VALUE;
        int maxind = 0;
        int minind = 0;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
                maxind = i;
            }

            if(nums[i]<min){
                min = nums[i];
                minind = i;
            }
        }
       
        System.out.println(max);
        System.out.println(min);
        System.out.println(maxind);
        System.out.println(minind);

        int minLeft = minind + 1;
        int minRight = nums.length - minind;

        int maxLeft = maxind + 1;
        int maxRight = nums.length - maxind;
        
        int A = Math.max(minLeft, maxLeft);
        int B = Math.max(minRight, maxRight);
        int C = minLeft + maxRight;
        int D = maxLeft + minRight;

        return Math.min(Math.min(A,B),Math.min(C,D));
    }
}