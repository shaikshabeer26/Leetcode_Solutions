class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int sum=0;
        for(int x:nums) sum+=x;
        return sum-n*nums[0];
    }
}
