class Solution {
    public boolean isPowerOfFour(int n) {
        if(n == 1) return true;
        if(n < 1) return false;
        if(n % 4 != 0) return false;
        while(n>0){
            if(n == 4) return true;
            if(n % 4 != 0) return false;
            n = n >> 2;
        }
        return false;
    }
}