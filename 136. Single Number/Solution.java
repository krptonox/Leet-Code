//LeetCode 136. Single Number
class Solution {
    public int singleNumber(int[] ar) {
        int n=ar.length;
        int h=0;
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(ar[i]==ar[j]){
                    c++;
                }
            }
            if(c==1){
                h=ar[i];
            }
        }
        return h;
    }
}