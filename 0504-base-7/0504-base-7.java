class Solution {
    public String convertToBase7(int num) {
        StringBuilder sb = new StringBuilder();
        boolean chk = num < 0;
        int num1 = Math.abs(num);
        if(num==0){
            return "0";
        }
        while(num1>0){
            int rem = num1%7;
            sb.append(rem);
            num1=num1/7;
        }      
        sb.reverse();  
        String result = sb.toString();
        System.out.print(result);
        if(chk){
            result = "-"+result;
            return result;
        }
        return result;
    }
}