class Solution {
    public int lengthOfLongestSubstring(String s) {
        String temp = "";
        int max = 0;
        for(int i=0;i<s.length();i++){
            temp="";
            for(int j=i;j<s.length();j++){
                char ch = s.charAt(j);
                if(temp.indexOf(ch)!=-1){
                    break;
                }
                temp+=ch;
            }
            max=Math.max(temp.length(),max);
        }


        return max;
    }
}