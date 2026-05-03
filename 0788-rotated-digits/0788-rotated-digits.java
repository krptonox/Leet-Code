class Solution {
    public int rotatedDigits(int n) {
        int count = 0;
        for(int i=0;i<=n;i++){
            if(check(i)==true){
                count++;
            }
        }
        return count;
    }
    public static boolean check(int n){
        boolean ans = false;
          while(n>0){
            int chk = n%10;
            if(chk==3 || chk==4 || chk==7 ){
                return false;
            }
            else if(chk==2 || chk==5 || chk==6 || chk==9){
                ans = true;
            }
            n=n/10;
        }
        return ans;
    }
}