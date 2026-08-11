class Solution {
    public int beautySum(String s) {
        List<String> ls = new ArrayList<>();
        for(int i = 0;i<s.length();i++){
            String d = "";
            for(int j=i;j<=s.length();j++){
                d = s.substring(i,j);
                ls.add(d);
            }
        }
        // ls.add(s);
        // System.out.println(ls);
        int ans = 0;
        for(int i=0;i<ls.size();i++){
           String b = ls.get(i);
           if(b.length()<=2) continue;
           int max = 0;
           int min = Integer.MAX_VALUE;
            int arr[] = new int[26];

            for(int j=0;j<b.length();j++){
                arr[b.charAt(j)-'a']++;
            }

            for(int j = 0;j<26;j++){
                if(arr[j]==0) continue;
                max = Math.max(max,arr[j]);
                min = Math.min(min,arr[j]);
            }
            ans = ans + max-min;
            // System.out.print(ans+" ");
            
        }


        return ans;
    }
}