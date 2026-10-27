class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        int l=0;
        int h=n-1;
        //int mid=(l+h)/2;
        // while(l<h){
        //     mid=(l+h)/2;
        //     if(mid%2==0) {
        //         if(nums[mid]==nums[mid+1]) l=mid+1;
        //         else if(nums[mid]==nums[mid-1]) h=mid-1;
        //         else return nums[mid];
        //     } 
        //     else  {
        //         if(nums[mid]==nums[mid-1]) l=mid+1;
        //         else if(nums[mid]==nums[mid+1]) h=mid-1;
        //         else return nums[mid];
        //     }
        // }
        // return 0;
       // if(n==1) return nums[0];
        while(l<h)
        {
            int mid=(l+h)/2;
            if((mid%2==0&&nums[mid]!=nums[mid+1])||(mid%2==1&&nums[mid]!=nums[mid-1])) h=mid;
            else l=mid+1;
        }
        return nums[l];
    
    }
}
