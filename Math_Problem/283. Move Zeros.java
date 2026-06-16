class Solution {
    public void moveZeroes(int[] nums) {
        int i=0,cnt=0;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                nums[cnt]=nums[i];
                cnt++;
            }
        }
        for(i=cnt;i<nums.length;i++)
        {
            nums[i]=0;
        }
    }
}
