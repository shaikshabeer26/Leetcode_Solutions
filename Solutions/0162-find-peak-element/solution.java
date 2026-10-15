class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        //start=0,end=n-1;
        /*----Approach-1------*/
       /* if(n==1) return 0;
        if(nums[0]>nums[1])  return 0;      
        if(nums[n-1]>nums[n-2]) return n-1;
         for(int i=1;i<n-1;i++)
         {
            if(nums[i]>nums[i+1]&&nums[i]>nums[i-1])  return i;

         // if(j!=-1) break;
         }
     return -1;*/

     /*----Approach-2----*/
      int l=0,r=n-1;
      while(l<r)
      {
        int mid=l+(r-l)/2;
        if(nums[mid]>nums[mid+1]) r=mid;
        else l=mid+1;
      } 
      return l;
    }
}
