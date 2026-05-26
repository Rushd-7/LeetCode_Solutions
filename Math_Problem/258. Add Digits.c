int addDigits(int num)
{
    int d,sum=num,no=num;
    while(sum>=10)
    {
        sum=0;
        while(no>0)
        {
            d=no%10;
            sum=sum+d;
            no/=10;
        }
        no=sum;
    }
    return sum;
}
