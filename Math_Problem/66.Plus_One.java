class Solution {
    public int[] plusOne(int[] digits) 
    {
        int i,l=digits.length;
        i=l-1;
        if(digits[i]==9)
        {
            while(i>=0 && digits[i]==9)
            {
                digits[i]=0;
                i--;
            }
            if(i==-1)
            {
                int newArr[]=new int[l+1];
                newArr[0]=1;
                return newArr;
            }
            else
            {
                digits[i]++;
                return digits;
            }
        }
        else
        {
            digits[i]++;
            return digits;
        }
    }
}
