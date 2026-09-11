class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        
        long vol = (long) length * width * height;
        Boolean Bulky = false;
        Boolean Heavy = false;
        if(length >= Math.pow(10,4) || width >= Math.pow(10,4) || height >= Math.pow(10,4) || vol >= Math.pow(10,9)) Bulky = true;

        if(mass >= 100) Heavy = true;

        if(Bulky == true &&  Heavy == true) return "Both";

        if(Bulky == false &&  Heavy == false) return "Neither";

        if(Bulky == true &&  Heavy == false) return "Bulky";

        if(Bulky == false &&  Heavy == true) return "Heavy";

        return "";
    }
}