class Solution {
    public int search(int[] nums, int target) {
        int f,l;
        f=0;
        l=nums.length-1;
        boolean fl=false;
        int m=0;
        while(f<=l)
        {
            m=f+(l-f)/2;
            if(nums[m]>target)
                l=m-1;
            else if(nums[m]<target)
                f=m+1;
            else
            {
                fl=true;
                break;
            }
        }
        if(fl==true)
            return m;
        else 
            return -1;
    }
}
