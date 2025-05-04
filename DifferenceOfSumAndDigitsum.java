// You are given a positive integer array nums.
// The element sum is the sum of all the elements in nums.
// The digit sum is the sum of all the digits (not necessarily distinct) that appear in nums.
// Return the absolute difference between the element sum and digit sum of nums.
// Note that the absolute difference between two integers x and y is defined as |x - y|.
// Example 1:
// Input: nums = [1,15,6,3]
// Output: 9
// Explanation: 
// The element sum of nums is 1 + 15 + 6 + 3 = 25.
// The digit sum of nums is 1 + 1 + 5 + 6 + 3 = 16.
// The absolute difference between the element sum and digit sum is |25 - 16| = 9.
class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        int digitSum=0;
        for(int i=0;i<nums.length;i++)
        {
            while(nums[i]>0)
            {
                int ld;
                ld=nums[i]%10;
                digitSum+=ld;
                nums[i]=nums[i]/10;
            }
        }
        return (sum-digitSum);
    }
}
