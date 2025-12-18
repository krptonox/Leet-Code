class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        int freq[] = new int[1001];

        for (int i = 0; i < nums1.length; i++) {
            freq[nums1[i]] = 1;
        }

        int size = 0;

        for (int j = 0; j < nums2.length; j++) {
            if (freq[nums2[j]] == 1) {
                size++;
                freq[nums2[j]] = 0; 
            }
        }

        for (int i = 0; i < nums1.length; i++) {
            freq[nums1[i]] = 1;
        }

        int[] result = new int[size];
        int k = 0;

        for (int j = 0; j < nums2.length; j++) {
            if (freq[nums2[j]] == 1) {
                result[k++] = nums2[j];
                freq[nums2[j]] = 0;
            }
        }

        return result;
    }
}
