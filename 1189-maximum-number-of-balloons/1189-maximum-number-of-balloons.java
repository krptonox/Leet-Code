class Solution {
    public int maxNumberOfBalloons(String s) {
        int b=0;
        int a =0;
        int l=0;
        int o=0;
        int n=0;
        for( char ch :s.toCharArray()){
            if(ch=='b'){
                b++;
            }
            else if(ch=='a'){
                a++;
            }
            else if(ch=='l'){
                l++;
            }
            else if(ch=='o'){
                o++;
            }
            else if(ch=='n'){
                n++;
            }
        }
        l=l/2;
        o=o/2;
        int ans = Math.min(b,a);
        ans=Math.min(ans,l);
        ans=Math.min(ans,o);
        ans=Math.min(ans,n);
        return ans;
        
    }
}