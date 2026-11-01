class Solution {
    public int minMoves(int[] nums) {
       // Arrays.sort(nums);
        int sum=0,min=nums[0];
        for(int x:nums)
        { 
            sum+=x;
            if(min>x) min=x;
        }
        return sum-nums.length*min;
    }
}
