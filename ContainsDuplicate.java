class Solution {
    public boolean containsDuplicate(int[] nums) {
        // int count=0;
        // for(int i=0;i<nums.length-1;i++)
        // {
        //     count=1;
        //     for(int j=i+1;j<nums.length;j++)
        //     {
        //         if(nums[i]==nums[j])
        //         {
        //             count++;
        //             if(count>=2)
        //             {
        //                 return true;
        //             }
        //         }
        //     }
        // } 
        // return false;
        HashSet<Integer> seen=new HashSet<>();
        for(int num:nums)
        {
            if(seen.contains(num))
            {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}
