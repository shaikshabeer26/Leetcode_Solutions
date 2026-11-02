class Solution {
    public int minMoves2(int[] nums) {
       Arrays.sort(nums);
       int n=nums.length;
       if(n==1) return 0;
       int res=0;
       for(int num:nums){
        res+=Math.abs(nums[n/2]-num);
       } 
       return res;
    }
}
