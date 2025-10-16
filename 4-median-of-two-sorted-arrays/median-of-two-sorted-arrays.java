class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums3[] = new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++){
            nums3[i] = nums1[i];
        }

        for(int j=0;j<nums2.length;j++){
            nums3[nums1.length+j] = nums2[j];
        }

        Arrays.sort(nums3);    

        int mid = (nums3.length-1)/2;
        if(nums3.length%2!=0){
            return (double)nums3[mid];
        }
        
        else{
            return (double)(nums3[mid]+nums3[mid+1])/2;
        }
    }
}