int numberOfSteps(int num) {
    int i=num,cnt=0;
    while(i!=0)
    {
        if(i%2==0)
            i=i/2;
        else
            i=i-1;
        cnt++;
    }
    return cnt;
}
