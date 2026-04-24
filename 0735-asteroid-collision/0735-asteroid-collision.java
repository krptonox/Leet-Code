class Solution {
    public int[] asteroidCollision(int[] as) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<as.length;i++){
            int ast = as[i];
            Boolean destroy = false;
            if(st.isEmpty() || ast>0 || st.peek()<0 ){
                st.push(ast);
            }
            else if(!st.isEmpty() && ast < 0 ){
            while(!st.isEmpty() && ast<0 && st.peek()>0){
                int Abst = Math.abs(ast);
                int chk = st.pop();
                if(Abst>chk){
                    continue;
                }
                else if(Abst<chk){
                    destroy = true;
                    st.push(chk);
                    break;
                }
                else{
                    destroy = true;
                    break;
                }
            }
            if(!destroy){
                st.push(ast);
            }
            }
        }
        
        int s = st.size();
        int arr[] = new int[s];
        for(int i=s-1;i>=0;i--){
            arr[i]=st.pop();
        }
        return arr;
    }
}