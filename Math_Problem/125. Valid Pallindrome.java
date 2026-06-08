class Solution {
    public boolean isPal(String s)
    {
        int i,l=s.length()-1;
        if(s.length()==0)
            return true;
        else
        {
            for(i=0;i<=l/2;i++)
            {
                if(s.charAt(i)!=s.charAt(l-i))
                {
                    return false;
                }
            }
            return true;
        }
    }
    public boolean isPalindrome(String s) {
        String w="";
        int i,l=s.length()-1;
        s=s.toLowerCase();
        for(i=0;i<=l;i++)
        {
            char ch=s.charAt(i);
            if(Character.isLetter(ch)||Character.isDigit(ch))
            {
                w=w+ch;
            }
        }
        return isPal(w);
    }
}
