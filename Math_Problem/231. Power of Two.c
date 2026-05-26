bool isPowerOfTwo(int n) {
    long x,i,pow=1;
    bool fl=false;
    while(true)
    {
        if(n==pow)
        {
            fl=true;
            break;            
        }
        else if(n>pow)
        {
            pow=pow*2;
        }
        else if(n<pow)
        {
            fl=false;
            break;
        }
    }
    return fl;
}
