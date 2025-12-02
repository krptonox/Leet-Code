class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> arr = new ArrayList<>(nums.length);
        int count = 0;
        for(int i=0;i<nums.length;i++){
             arr.add(nums[i]);
        }
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)==val){
                arr.remove(i);
                i--;
            }
        }
        for(int i=0;i<arr.size();i++){
            nums[i] = arr.get(i);
            System.out.println(nums[i]);
        }
        
        return arr.size();
    }
}