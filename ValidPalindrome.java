class Solution {
    public boolean isPalindrome(String s) {
        String original=s;
        String clean=original.toLowerCase().replaceAll("[^a-z0-9]","");
        String reversed= new StringBuilder(clean).reverse().toString();
        if(clean.equals(reversed))
        {
            return true;
        }
        return false;
    }
}
