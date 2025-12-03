class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int maxC = 0;

        for(int i=0;i<sentences.length;i++){
            System.out.println(sentences[i]);
            String s = sentences[i];
            String s1[] = s.split(" ");
            int count = s1.length;
            maxC = Math.max(maxC,count);
        }
        return maxC;
    }
}