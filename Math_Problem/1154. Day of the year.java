class Solution {
    public int dayOfYear(String date) {
        int i,x=Integer.parseInt(date.substring(5,7)); //
        int cnt=0,y=Integer.parseInt(date.substring(0,4));
        for(i=1;i<x;i++)
        {
            if((i%2!=0 && i<=7) || (i%2==0 && i>7))
            {
                cnt+=31;
            }
            else 
            {
                cnt+=30;
            }
                
        } 
        if(x>2)
                cnt-=2;    //as per above calcuation, Feb was alloted 30 days instead of 28.
        cnt+=Integer.parseInt(date.substring(8));
        if((y%400==0||(y%4==0 && y%100!=0)) && (Integer.parseInt(date.substring(5,7))>2)) //leap year
            cnt+=1;
        return cnt;
    }
}
