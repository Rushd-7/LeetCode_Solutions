class Solution {
    public int lengthOfLastWord(String s) 
    {
        s=s.trim();
        char ch;
        int i,t,cnt=0,l=s.length();
        String w="";
        t=s.lastIndexOf(' ');
        for(i=l-1;i>t;i--)
        {
           ch=s.charAt(i);
           cnt++;
           if(ch==' ' || i==0)
            break;
        }
        return cnt;
    }
}
