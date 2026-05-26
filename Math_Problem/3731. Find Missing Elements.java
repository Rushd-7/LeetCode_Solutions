import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int cnt,p,i,j,l=nums.length-1,large=nums[0],small=nums[0];
        boolean fl=false;
        for(i=1;i<=l;i++)
        {
            if(large<nums[i])
                large=nums[i];
            if(small>nums[i])
                small=nums[i];
        }
        int number[]=new int[large-small+1];
        for(cnt=0,i=small;cnt<=(large-small);i++,cnt++)
            number[cnt]=i;
        List<Integer> sorted=new ArrayList<>();
        cnt=0;
        for(i=0;i<(large-small+1);i++)
        {
            fl=false;
            for(j=0;j<=l;j++)
            {
                if(nums[j]==number[i])
                {
                    fl=true;
                    break;
                }
            }
            if(!fl)
                sorted.add(number[i]);
        }
        return sorted;
    }
}
