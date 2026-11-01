class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int x:nums) sum+=x;
        return sum-nums.length*nums[0];
    }
}
