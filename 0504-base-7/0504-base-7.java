class Solution {
    public String convertToBase7(int num) {
        StringBuilder sb = new StringBuilder();
        boolean chk = num < 0;
        int num1 = Math.abs(num);
        if(num==0){
            return "0";
        }
        while(num1>0){
            sb.append(num1%7);
            num1=num1/7;
        }      
        sb.reverse();  
        String result = sb.toString();
        if(chk){
            result = "-"+result;
            return result;
        }
        return result;
    }
}