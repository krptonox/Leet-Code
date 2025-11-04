class Solution {
    public int strStr(String haystack, String needle) {
        int len = haystack.length();
        int len1 = needle.length() - 1;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<=len;j++){
                String s1 = haystack.substring(i,j);
                if(needle.equals(s1)){
                    return i;
                }
                System.out.println(haystack.substring(i,j));
            }
        }
        return -1;
    }
}