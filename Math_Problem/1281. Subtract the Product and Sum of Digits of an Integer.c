int subtractProductAndSum(int n) {
    int s=0,p=1,d,no=n;
    while(no>0)
    {
        d=no%10;
        s=s+d;
        p=p*d;
        no/=10;
    }
    return (p-s);
}
