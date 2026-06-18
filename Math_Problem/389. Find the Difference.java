class Solution 
{
    public char findTheDifference(String s, String t) 
    {
        char c1[]=s.toCharArray();
        char c2[]=t.toCharArray();
        int x1=0;
        //for(int i=0;i<c1.length;i++)
        //    x1=x1^c1[i];
        for(int i=0;i<c2.length;i++)
        {
            if(i<c1.length)
                x1=x1^c1[i];
            x1=x1^c2[i];
        }
        return (char)x1;
    }
}
