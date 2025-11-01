class Solution {
    public char repeatedCharacter(String s) {
        int arr[] = new int[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            arr[ch - 'a']++;
            if(arr[ch-'a'] == 2){
                return ch;
            }
        }
        // for(int i=0;i<s.length();i++){
        //    char ch = s.charAt(i);
        //    if(arr[ch - 'a']==2){
        //     return ch;
        //    }
        // }
        return 0;

    }
}