int mySqrt(int x) {
    long i,sqr;
    for(i=1;true;i++)
    {
        if(x==(i*i))
        {
            sqr=i;
            break;
        }
        else if(x>(i*i))
            continue;
        else if(x<(i*i))
        {
            sqr=i-1;
            break;            
        }
    }
    return sqr;
}
