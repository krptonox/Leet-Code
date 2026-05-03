class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        for(int i : nums){
            System.out.println(hash.add(i));
        }
        if(hash.size()==nums.length) return false;
        return true;
    }
}