class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        
        int[] result = new int[nums.length];
        l1.add(nums[0]);
        l2.add(nums[1]);
        
        int j = 2;
        int k = 2;

        for(int i=2;i<nums.length;i++){
           int num = l1.get(j-2);
           int num1 = l2.get(k-2);
           if(num > num1){
            l1.add(nums[i]);
            j++;
           }
           else{
            l2.add(nums[i]);
            k++;
           }
        }

        for(int i=0;i<l1.size();i++){
            result[i] = l1.get(i);
        }
        
        int in = l1.size();
        for(int i=0;i<l2.size();i++){
            result[in] = l2.get(i);
            in++;
        }
        
        return result;
    }
}