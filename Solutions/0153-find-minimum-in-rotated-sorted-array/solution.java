class Solution {
    public int findMin(int[] nums) {
        //  Arrays.sort(nums);
        //  return nums[0];       //approach-1;
        int l=0;
        int h=nums.length-1;
        int ans=Integer.MAX_VALUE;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[l]<=nums[mid])
            {
                ans=Math.min(nums[l],ans);
                l=mid+1;
            }
            else
            {
                ans=Math.min(nums[mid],ans);
                h=mid-1;
            }
        }
        return ans;
        
        
    }
}
