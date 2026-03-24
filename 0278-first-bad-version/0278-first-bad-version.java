/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
       return Binary(n);
    }
    public int Binary(int n){
        int start = 0;
        int end = n;
        int ans = 0;
        while(start<=end){
            int mid = start+(end - start)/2;
            if(isBadVersion(mid) == true){
                ans = mid;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return ans;
    }
}