class Solution {
    public int hammingDistance(int x, int y) {
        int x1,x2,cnt=0;
        int a=x>y?x:y;
        int b=x>y?y:x;
        while(a>0) //loop till greater number is greater than 0.
        {
            x1=a&1; //extracting last bit of both numbs.
            x2=b&1;
            if(x1!=x2)
                cnt++; //counting unequal bits
            a>>=1; //right shit each numb.
            b>>=1;
        }
        return cnt;
    }
}
