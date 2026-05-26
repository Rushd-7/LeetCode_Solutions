class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i,j;
        int ex[]=new int[2];
        for(i=0;i<=nums.length-1;i++)
        {
            for(j=0;j<=nums.length-1;j++)
            {
                if(i==j)
                    continue;
                if(target==(nums[i]+nums[j]))
                {
                    ex[0]=i;
                    ex[1]=j;
                    break;
                }
            }
        }
        return ex;
    }
}
