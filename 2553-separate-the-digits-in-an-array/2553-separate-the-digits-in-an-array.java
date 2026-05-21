class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> ls = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            String str = String.valueOf(nums[i]);
            for(int j=0;j<str.length();j++){
                ls.add(str.charAt(j)-'0');
            }
            // if(nums[i]>=10){
            //   int n = nums[i];
            //   int newn = 0;
            //   while(n>0){
            //     int nn = n%10;
            //     newn = newn*10 + nn;
            //     n=n/10;
            //   }
            //   while(newn>0){
            //     int ch = newn%10;
            //     ls.add(ch);
            //     newn=newn/10;
            //   }
            // }
            // else{
            //     ls.add(nums[i]);
            // }
        }
        int[] arr = new int[ls.size()];

        for(int i = 0; i < ls.size(); i++) {
           arr[i] = ls.get(i);
           }

        return arr;

    }
}