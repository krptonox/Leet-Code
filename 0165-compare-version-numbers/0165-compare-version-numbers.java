class Solution {
    public int compareVersion(String version1, String version2) {
        String[] arr1 = version1.split("\\.");
        String[] arr2 = version2.split("\\.");
        int n = Math.max(arr1.length, arr2.length);

        for (int i = 0; i < n; i++) {
           int a = (i < arr1.length) ? Integer.parseInt(arr1[i]) : 0;
           int b = (i < arr2.length) ? Integer.parseInt(arr2[i]) : 0;

           if (a > b) return 1;
           if (a < b) return -1;
          }

        return 0;
    }
}