class Solution {
    public int minMoves(int[] nums) {
        int moves=0;
        Arrays.sort(nums);
        int n=nums.length;
        for(int num: nums)
        {
        moves+=(nums[n-1]-num);
        }
        return moves;
    }
}
