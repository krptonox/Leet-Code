class Solution {
    public int[] countBits(int n) {
        int count = 0;
        int num = 0;
        int num1 = n;
        int[] arr = new int[n+1];
        while(num<=num1){
           int nuum = num;
           count = 0;
        while(nuum>0){
            int nm = nuum%2;
            if(nm == 1){
                count++;
            }
            arr[num] = count;
            nuum=nuum/2;
          }
          num++;
        }
    return arr;
    }
}