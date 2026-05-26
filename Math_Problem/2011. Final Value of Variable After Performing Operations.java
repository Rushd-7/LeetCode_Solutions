class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0,i;
        for(i=0;i<=operations.length-1;i++)
        {
            if(operations[i].equals("X++")||operations[i].equals("++X"))
                x=x+1;
            else if(operations[i].equals("X--")||operations[i].equals("--X"))
                x=x-1;
        }
        return x;
    }
}
