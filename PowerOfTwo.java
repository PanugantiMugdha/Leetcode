// Given an integer n, return true if it is a power of two. Otherwise, return false.
// An integer n is a power of two, if there exists an integer x such that n == 2x.
// Example 1:
// Input: n = 1
// Output: true
// Explanation: 20 = 1
class Solution {
    public boolean isPowerOfTwo(int n) {
        for(int i=0;i<=50;i++)
        {
            if(Math.pow(2,i)==n)
            {
                return true;
            }
        }
        return false;
    }
}
