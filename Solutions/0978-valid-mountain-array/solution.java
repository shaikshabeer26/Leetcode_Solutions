class Solution {
    public boolean validMountainArray(int[] nums) {
     int n=nums.length;
     if(n<3) return false;
     if(nums[0]>nums[1]) return false;
     for(int i=0;i<=n-1;i++)
     {
        if(nums[i]<nums[i+1]) {
          if((i+1)==n-1) return false;
          continue; }
        else{
             while(i<n-1)
               {
                if(nums[i]>nums[i+1]) i++;
                else return false;
               } 
        }
     }
     return true;
    }
}
