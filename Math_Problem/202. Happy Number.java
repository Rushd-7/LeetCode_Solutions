class Solution {
    public boolean isHappy(int n) {
        if(n==1 || n==7)
            return true;
        if(n==4)
            return false;
        else
        {
            int num=0;
            while(n>0)
            {
                num+=(n%10)*(n%10);
                n/=10;
            }
            return isHappy(num);
        }
    }
}
