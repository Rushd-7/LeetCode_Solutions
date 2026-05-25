class Solution {
    public int[] runningSum(int[] nums) 
    {
        int i=0;
        int sum[]=new int[nums.length];
        for(i=0;i<nums.length;i++)
        {
            if(i==0)
                sum[i]=nums[i];
            else
                sum[i]=sum[i-1]+nums[i];
        }
        return sum;
    }
}
