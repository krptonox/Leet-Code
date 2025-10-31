class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.toLowerCase();
        s1 = s1.replaceAll("[^a-zA-Z0-9]", "");
        int left = 0;
        int right = s1.length() - 1;
        System.out.println(right+1);
        if(s1==" "){
            return true;
        }
        else{
        while(left < right){
            if(s1.charAt(left)!=s1.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
    }
        return true;
    }
}