class Solution {
    public boolean isPalindrome(int x) {
        int y = x;
        int rev = 0;
        int pal = 0;
          while(y!=0){
            rev = y%10;
            pal = pal*10 + rev;
            y=y/10;
          }  
          if(pal == x && x >= 0){
            return true;
          }
          else if(x < 0){
            return false;
          }
          else{
            return false;
          }
    }
}