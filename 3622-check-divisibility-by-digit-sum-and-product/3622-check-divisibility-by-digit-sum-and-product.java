class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int pro = 1;
        int n1 = n;
        while(n>0){
            int lst = n%10;
            sum += lst;
            pro *= lst;
            n /= 10;
        }

        int ch = sum+pro;

        return n1%ch==0;
    }
}