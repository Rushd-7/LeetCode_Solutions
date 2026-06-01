class Solution {
    public int digitFrequencyScore(int n) {
        int freq[]=new int[10];
        int i,d,no=n,score=0;
        while(no>0)
        {
            d=no%10;
            freq[d]++;
            no/=10;
        }
        for(i=0;i<10;i++)
            score+=i*freq[i];
        return score;
    }
}
