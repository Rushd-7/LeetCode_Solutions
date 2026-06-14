int hammingWeight(int n) {
    if(n==0)
        return 0;
    else
    {
        int x=n&1; //rightmost bit extraction. 
        if(x==1)
            return 1+hammingWeight(n>>1);
        else
            return hammingWeight(n>>1);
    }
}
