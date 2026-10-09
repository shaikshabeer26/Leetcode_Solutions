class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int i=n/2;
        // if(nums[i]>target)
        // {
         
        // }
        // else{
        //     for(i=n/2;i<n;i++) if(nums[i]==target) return i; 
        //     return -1;
        // }
        int start=0; int end=n-1;
        while(start<=end)
        {
          int  mid=(start+end)/2;
            if(nums[mid]==target) return mid;
            else if(target<nums[mid]) end=mid-1;
            else  start=mid+1;
        }
        return -1;
    }
}
