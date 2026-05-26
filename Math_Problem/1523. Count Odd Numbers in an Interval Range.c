int countOdds(int low, int high){
    int i,cnt=0;
    for(i=low;i<=high;i++)
        if(i%2!=0)
            cnt++;
    return cnt;
}
