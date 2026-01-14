class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
            while(i<nums2.length){
                nums1[m+i] = nums2[i]; 
                i++;    
            }
            Arrays.sort(nums1);
    }
}