class Solution {
    public int[] scoreValidator(String[] events) {
        int count = 0;
        int score = 0;
        int i = 0;
        while(count!=10 && i!=events.length){
            if(events[i].equals("WD") || events[i].equals("NB")){
                score+=1;
            }
            else if(events[i].equals("W")){
                count+=1;
            }
            else{
              int num = Integer.parseInt(events[i]);
              score+=num;
            }
            i++;
        }
        return new int[]{score,count};
    }
}