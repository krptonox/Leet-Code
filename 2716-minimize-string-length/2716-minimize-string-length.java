class Solution {
    public int minimizedStringLength(String s) {
        HashSet<Character> set  = new HashSet<>();
        for(char ch : s.toCharArray()){
            set.add(ch);
        }

        int len = set.size();
        return len;
    }
}