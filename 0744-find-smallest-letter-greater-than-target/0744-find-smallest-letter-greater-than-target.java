class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int min = Integer.MAX_VALUE;
        char ans = '0';
         int chk = 0;
        for(int i=0;i<letters.length;i++){
            char s = letters[i];
            chk = s - target;
            if(chk > 0){
                min = Math.min(min,chk);
            }
            if(chk <= min && chk > 0){
               ans =  letters[i];
            }
        }
        if(ans == '0') return letters[0];
        System.out.println(chk +" "+ min);
        return ans;
    }
}