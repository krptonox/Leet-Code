class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        if(s.equals(goal)) return true;
        // String result = "";
        boolean ans = false;
        for(int i=0;i<s.length();i++){
            s = s.substring(1)+s.charAt(0);
            System.out.println(s);
            if(s.equals(goal)){
                ans = true;
                return ans;
            }
        }
        return ans;
    }
}