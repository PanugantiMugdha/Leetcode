class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int original = x;
        int palindrome = 0;

        while (x > 0) {
            int lastDigit = x % 10;
            palindrome = (palindrome * 10) + lastDigit;
            x = x / 10;
        }

        return original == palindrome;
    }

}
