class Solution {
    public String defangIPaddr(String address) {
        String s1 = address.replace(".","[.]");
        return s1;
    }
}