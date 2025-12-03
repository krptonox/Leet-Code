class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxl =0;
        String temp="";
        for(int i=0;i<s.length();i++){
            temp="";
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                if(temp.indexOf(ch)!=-1){
                    break;
                }
                else{
                    temp=temp+ch;
                }
            }
            if(temp.length()>maxl){
                maxl = temp.length();
            }
        }
        return maxl;
    }
}