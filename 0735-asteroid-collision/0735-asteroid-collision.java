class Solution {
    public int[] asteroidCollision(int[] as) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<as.length;i++){
            boolean destroyed = false;
            int ast = as[i];
           if(st.isEmpty() || ast > 0 || st.peek() < 0) {
                st.push(ast);
            }
            else if(!st.isEmpty() && st.peek()>0){
                while(!st.isEmpty()&& st.peek()>0 && ast<0){
                    int Abst = Math.abs(ast);
                    int chk = st.pop();
                    if(Abst>chk){
                        continue;
                    }
                    else if(Abst<chk){
                        st.push(chk);
                        destroyed = true;
                        break;
                    }
                    else{
                        destroyed = true;
                        break;
                    }
                }
                if(!destroyed){
                    st.push(ast);
                }
            }
            
        }

        int s = st.size();
        int[] arr = new int[s];
        for(int i=s-1;i>=0;i--){
            arr[i]=st.pop();
        }
        return arr;
    }
}