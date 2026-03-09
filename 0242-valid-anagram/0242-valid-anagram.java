class Solution {
       static boolean isAnagram(String s, String t) {
        // Scanner sc = new Scanner(System.in);
        // String s = sc.next();
        // String t = sc.next();
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> mp1 = makeFreq(s);
        HashMap<Character, Integer> mp2 = makeFreq(t);
        if(mp1.equals(mp2)){
            return true;
        }
        return false;

    }
    static HashMap<Character,Integer> makeFreq(String str){
        HashMap<Character, Integer> mp = new HashMap<>();
        for(int i=0;i<str.length();i++){
            Character ch = str.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch,1);
            }
            else{
                int currFreq = mp.get(ch);
                mp.put(ch,currFreq+1);
            }
        }
        return mp;
}
}