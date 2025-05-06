// Implement a function signFunc(x) that returns:
// 1 if x is positive.
// -1 if x is negative.
// 0 if x is equal to 0.
// You are given an integer array nums. Let product be the product of all values in the array nums.
// Return signFunc(product).
// Example 1:
// Input: nums = [-1,-2,-3,-4,3,2,1]
// Output: 1
// Explanation: The product of all values in the array is 144, and signFunc(144) = 1
// -------------ORIGINAL------------------
// class Solution {
//     public int arraySign(int[] nums) {
//         int product=1;
//         int s=1;
//         for(int i=0;i<nums.length;i++)
//         {
//             product*=nums[i];
//         }
//         if(product>=1)
//         {
//             s=1;
//         }
//         if(product<0)
//         {
//             s=-1;
//         }
//         else if(product==0)
//         {
//             s=0;
//         }
//         return s;
//     }
// }
// ----------------------------------------------------------------OPTIMISED-----------------------------------------------------------------------
class Solution {
    public int arraySign(int[] nums) {
        int sign = 1; // Start with positive sign
        for (int num : nums) {
            if (num == 0) return 0;   // If any element is 0, product is 0
            if (num < 0) sign *= -1;  // Flip sign for every negative number
        }
        return sign; // 1 if positive, -1 if negative
    }
}
