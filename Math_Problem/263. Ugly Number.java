class Solution {
    public boolean isUgly(int n) 
    {
        int i,x=1;
        while(n>=1)
        {
            if(n%2==0)
                x=2;
            else if(n%3==0)
                x=3;
            else if(n%5==0)
                x=5;
            else
            {
                break;
            }
            n=n/x;
        }
        if(n==1)
            return true;
        else
            return false;
    }
}
