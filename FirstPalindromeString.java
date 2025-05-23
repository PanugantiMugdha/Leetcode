// Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".

// A string is palindromic if it reads the same forward and backward.
// Example 1:
// Input: words = ["abc","car","ada","racecar","cool"]
// Output: "ada"
// Explanation: The first string that is palindromic is "ada".
// Note that "racecar" is also palindromic, but it is not the first.
class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++)
        {
            String original=words[i];
            String clean=original.toLowerCase().replaceAll("[^a-z0-9]","");
            String reversed= new StringBuilder(clean).reverse().toString();
            if(clean.equals(reversed))
            {
                return original;
            }
        }
        return ""; 
    }
}
