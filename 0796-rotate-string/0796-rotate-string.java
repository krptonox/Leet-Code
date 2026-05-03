class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        if(s.equals(goal)) return true;
        String result = s + s;
        boolean ans = false;
        if(result.contains(goal)) return true;
        return false;
    }
}