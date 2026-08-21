class Solution {
    public String getHint(String secret, String guess) {
        int bull = 0;
        int cow = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        boolean[] Bull = new boolean[secret.length()];

        int len = guess.length();
        for(int i=0;i<len;i++){
            if(secret.charAt(i) == guess.charAt(i)){
                bull++;
                Bull[i] = true;
            }
        }

        for(int i=0;i<len;i++){
            if(Bull[i]) continue;
            map.put(secret.charAt(i),map.getOrDefault(secret.charAt(i),0)+1);
        }

        for(int i=0;i<len;i++){
            if(Bull[i]) continue;
            char ch = guess.charAt(i);
            
            if(map.getOrDefault(ch,0) > 0){
                cow++;
                map.put(ch, map.get(ch) - 1);
            }
        }

        String str = Integer.toString(bull);
        String str1 = Integer.toString(cow);

        return bull+"A"+cow+"B";
    }
}