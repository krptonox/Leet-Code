class Solution {
    public int findLucky(int[] arr) {
        int count = 0;
        int ans = 0;
        int max = -1;
        for(int i=0;i<arr.length;i++){
            count = 0;
           for(int j=0;j<arr.length;j++){
              if(arr[i]==arr[j]){
                count++;
              }
           }
           if(count==arr[i]){
             ans = arr[i];
             max = Math.max(ans,max);
           }
        }
        return max;
    }
}