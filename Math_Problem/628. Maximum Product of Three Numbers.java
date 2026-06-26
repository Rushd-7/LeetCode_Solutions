class Solution {
    public int maximumProduct(int[] nums) {
        int i,x1,x2,n=nums.length;
        Arrays.sort(nums);
        x1=nums[n-1]*nums[n-2]*nums[n-3];
        x2=nums[0]*nums[1]*nums[n-1];
        return x1>x2?x1:x2;
    }
}
