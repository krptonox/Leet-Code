class Solution {
    public int maximumLengthSubstring(String s) {
       Map<Character, Integer> map = new HashMap<>();
       int l = 0;
       int maxl = 0;
       for(int r=0;r<s.length();r++){
        char currChar = s.charAt(r);
        map.put(currChar,map.getOrDefault(currChar,0)+1);

        while(map.get(currChar)>2){
            char leftChar = s.charAt(l);
            map.put(leftChar,map.get(leftChar)-1);
            l++;
        }

        maxl = Math.max(maxl,r-l+1);
       }
       return maxl;
    }
}