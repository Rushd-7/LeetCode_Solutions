class Solution {
    public int removeDuplicates(int[] nums) 
    {
        int i,cnt=1,l=nums.length;
        for(i=1;i<l;i++)
        {
            if(nums[i]!=nums[i-1])
            {
                nums[cnt]=nums[i];
                cnt++;
            }
        }
        return cnt;
    }
}
