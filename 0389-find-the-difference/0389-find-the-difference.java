class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<String,Integer> map = new HashMap<>();
        int arr[] = new int[27];
        for(int i=0;i<t.length();i++){
            char ad = t.charAt(i);
            arr[ad - 'a']++;
        }
        for(int i=0;i<s.length();i++){
            char ad = s.charAt(i);
            arr[ad - 'a']--;
        }
        for(int i=0;i<27;i++){
            if(arr[i]==1){
                char find = (char)('a'+i);
                return find;
            }
        }
        return '.';
    }
}