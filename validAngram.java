class Solution {
    public boolean isAnagram(String s, String t) {
        s=s.toLowerCase();
        t=t.toLowerCase();
        if(s.length()==t.length())
        {
            char[] sCharArray=s.toCharArray();
            char[] tCharArray=t.toCharArray();
            Arrays.sort(sCharArray);
            Arrays.sort(tCharArray);
            boolean result=Arrays.equals(sCharArray,tCharArray);
            if(result)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        return false;
    }
}
