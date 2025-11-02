class Solution {
    public int romanToInt(String s) {
        int len = s.length();
        int sum = 0;
        for(int i=0;i<len;i++){
            char ch = s.charAt(i);
            int value = 0;
            switch(ch){
                case 'I': value = 1;
                break;
                case 'V': value = 5;
                break;
                case 'X': value = 10;
                break;
                case 'L': value = 50;
                break;
                case 'C': value = 100;
                break;
                case 'D': value = 500;
                break;
                case 'M': value = 1000;
                break;
            }

            if(i+1 < len){
                char nextChar = s.charAt(i+1);
                int nextvalue = 0;

                switch(nextChar){
                    case 'I': nextvalue = 1;
                    break;
                    case 'V': nextvalue = 5;
                    break;
                    case 'X': nextvalue = 10;
                    break;
                    case 'L': nextvalue = 50;
                    break;
                    case 'C': nextvalue = 100;
                    break;
                    case 'D': nextvalue = 500;
                    break;
                    case 'M': nextvalue = 1000;
                    break;
                }

                if(nextvalue > value){
                    sum = sum - value;
                    continue;
                }
            }

              sum = sum + value;
        }
        return sum;
    }
}