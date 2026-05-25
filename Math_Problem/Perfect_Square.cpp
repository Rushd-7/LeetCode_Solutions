class Solution 
{
public:
    bool isPerfectSquare(int num) 
    {
        long f=1,l=num;
        long x=1;
        bool fl=false;
        while(f<=l)
        {
            x=(f+(l-f)/2);
            if(x*x==num)
            {
                fl=true;
                break;
            }
            else if(x*x>num)
                l=x-1;
            else if(x*x<num)
                f=x+1;
        }
        return fl;
    }
};
