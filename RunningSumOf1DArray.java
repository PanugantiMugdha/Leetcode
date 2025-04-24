class Solution {
    public int[] runningSum(int[] nums) {
        int total;
        int newArray[]=new int[nums.length];
        newArray[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            int sum=0;
            for(int j=i-1;j>=0;j--)
            {
                sum+=nums[j];
            }
            total=sum+nums[i];
            newArray[i]=total;
        }
        return newArray;
    }
}
