class Solution {
    public int sumOfSquares(int[] nums) {
        int n=nums.length;
        int prdsum=0;
        //if(n==2) return nums[1]*nums[1];
        for(int i=1;i<=n;i++)
        {
         if(n%i==0){
            prdsum+=nums[i-1]*nums[i-1];
         }
        }
        return prdsum;
    }
}
