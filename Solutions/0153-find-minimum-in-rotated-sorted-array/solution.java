class Solution {
    public int findMin(int[] nums) {
        //  Arrays.sort(nums);
        //  return nums[0];       //approach-1;
        
        /*----Approach-2-----*/
       /* int l=0;
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
        */
        /*-----Approach-3 -------*/
        int l=0,r=nums.length-1;
        int mid=(l+r)/2;
        while(l<=r)
        {
        mid=(l+r)/2;
        if(nums[mid]<nums[r]) r=mid;
        else l=mid+1;
        }
        return nums[mid];
        
    }
}
