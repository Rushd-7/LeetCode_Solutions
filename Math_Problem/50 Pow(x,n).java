class Solution 
{
    public double power(double x,long n)
    {
        if(n==0)
         return 1.0;
        double half=power(x,n/2);
        if(n%2==0)
            return half*half;
        else
            return x*half*half;
    }
    public double myPow(double x, int n) {
        double res;
        if(x!=0)
        {
            if(n>=1)
                res=power(x,n);
            else
            {
                res=power(x,((-1)*(long)n));
                res=1.0/res;
            }
            return res;
        }
        else
        {
            if(n==0)
                return 1;
            else
                return 0;
        }
    }
}
