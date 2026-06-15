class Solution {
    public boolean isAnagram(String s, String t) {
        int freq[]=new int[26];
        char c;
        int i;
        if(s.length()!=t.length())
            return false;
        else
        {
            for(i=0;i<=s.length()-1;i++)
            {
                c=s.charAt(i);
                freq[c-'a']++;
            }
            for(i=0;i<=t.length()-1;i++)
            {
                c=t.charAt(i);
                freq[c-'a']--;
            }
            for(i=0;i<26;i++)
                if(freq[i]!=0)
                    return false;
            return true;
        }
    }
}
