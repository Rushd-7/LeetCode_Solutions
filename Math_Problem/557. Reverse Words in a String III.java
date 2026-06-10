class Solution {
    public String reverse(String s)
    {
        StringBuilder rev = new StringBuilder(s);
        rev.reverse();  
        return rev.toString();
    }
    public String reverseWords(String s) {
        String words[]=s.split(" ");
        int i;
        for(i=0;i<words.length;i++)
        {
            words[i]=reverse(words[i]);
        }
        return String.join(" ",words);
    }
}
