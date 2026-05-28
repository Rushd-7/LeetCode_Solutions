class Solution {
    public int singleNumber(int[] nums) 
    {
        int i,res;
        res=0;
        for(i=0;i<nums.length;i++)
        {
            res=res ^ nums[i];
        }
        return res;
    }
}
