class Solution {
public:
    bool isPowerOfThree(int n) {
        if(n==1)   // a number after recursion returning to 1 is basically a power of three
            return true;
        if(n==0 || n%3 !=0)  //if division results in 0 as Q or n is not divisible by 3 -> not a power of 3
            return false;
        else
            return isPowerOfThree(n/3);  //we will reduce n to 1.
    }
};
