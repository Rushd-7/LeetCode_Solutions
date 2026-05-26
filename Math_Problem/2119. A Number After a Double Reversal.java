class Solution {
    public int reverse(int n)
    {
        int rev=0;
        while(n>0)
        {
            rev=rev*10+(n%10);
            n/=10;
        }
        return rev;
    }
    public boolean isSameAfterReversals(int num) {
        int reversed1,reversed2;
        reversed1=reverse(num);
        reversed2=reverse(reversed1);
        if(num==reversed2)
            return true;
        else
            return false;        
    }
}
