class Solution {
    public int thirdMax(int[] nums) {
        int i,l1=Integer.MIN_VALUE,l2=Integer.MIN_VALUE,l3=Integer.MIN_VALUE;
        int l=nums.length;
        boolean fl1=false, fl2=false;
        boolean hasMinValue = false;
        for(int num : nums)
            if(num == Integer.MIN_VALUE)
                hasMinValue = true;
        for(i=0;i<l;i++)
        {
            if(l3<=nums[i])
                l3=nums[i];
        }
        for(i=0;i<l;i++)
        {
            if(l2<nums[i] && nums[i]<l3)
            {
                l2=nums[i];
                fl2=true;
            }
                    
        }
        for(i=0;i<l;i++)
        {
            if(l1<nums[i] && nums[i]<l2)
            {
                    l1=nums[i];
                    fl1=true;
            }
        }
        if(!fl2) 
            return l3;
        if(!fl1)
        {
            if(hasMinValue && l2 != Integer.MIN_VALUE)
              return Integer.MIN_VALUE;  // MIN_VALUE is the third distinct max
            return l3;
        }
        return l1;
    }
}
