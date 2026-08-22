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
        System.out.println(sum);
        System.out.println(pro);
        int ch = sum+pro;

        if(n1%ch==0){
            return true;
        }

        return false;
    }
}