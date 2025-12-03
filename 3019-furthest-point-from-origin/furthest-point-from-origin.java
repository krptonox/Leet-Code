class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='L'){
                a++;
            }
            else if(moves.charAt(i)=='R'){
                b++;
            }
            else{
                c++;
            }
        }
        if(a>b){
            d=(a-b)+c;
        }
        else if(b>a){
            d=(b-a)+c;
        }
        else{
            d=(c+a)-b;
        }
        return d;
    }
}