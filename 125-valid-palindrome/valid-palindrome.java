class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.toLowerCase();
        s1 = s1.replaceAll("[^a-zA-Z0-9]", "");
        int size = s1.length();
        int fst = 0;
        int lst = s1.length() - 1;
        while(lst>fst){
             if(s1.charAt(fst)!=s1.charAt(lst)){
                return false;
             }
             else{
                lst--;
                fst++;
             }
        }
        return true;
    }
}