class Solution {
    public int digitSum(int x)
    {
        int s=0;
        while(x>0)
        {
            s+=x%10;
            x/=10;
        }
        return s;
    }
    public int minElement(int[] nums) {
        int i;
        int min=Integer.MAX_VALUE;
        for(i=0;i<nums.length;i++)
        {
            nums[i]=digitSum(nums[i]);
            if(min>nums[i])
                min=nums[i];
        }
        return min;
    }
}
