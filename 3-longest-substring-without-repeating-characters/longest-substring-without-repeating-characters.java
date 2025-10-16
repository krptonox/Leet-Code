class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
       for (int i = 0; i < s.length(); i++) {
            String temp = ""; 

            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);

                if (temp.indexOf(ch) != -1) {
                    break;
                } else {
                    temp += ch; 
                }
            }

            if (temp.length() > maxLen) {
                maxLen = temp.length();
            }
        }
        return maxLen;
    }
}