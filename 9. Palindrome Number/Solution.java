//LeetCode 9. Palindrome Number
class Solution {
    public boolean isPalindrome(int x) {
        int s = x;
        int pal=0;
        int a = 1;
        while(s>0){
         a = s%10;
         pal=pal*10+a;
         s=s/10;
        }
               System.out.print(pal);

        if(pal == x){
            return true;
        }
        else{
            return false;
        } 
      }
}