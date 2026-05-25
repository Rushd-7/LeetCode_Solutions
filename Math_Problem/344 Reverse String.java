class Solution {
    public void reverseString(char[] s) 
    {
        int i,l=s.length;
        for(i=0;i<l/2;i++)
        {
            char temp=s[i];
            s[i]=s[l-i-1];
            s[l-i-1]=temp;
        }
        System.out.println(s);
    }
}
