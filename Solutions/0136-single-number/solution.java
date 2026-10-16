class Solution {
    public int singleNumber(int[] nums) {
      int n=nums.length;
    Arrays.sort(nums); int i=0;
      for(;i<n-1;i+=2)  
      {
        if(nums[i]==nums[i+1]) continue;
        else break;//return nums[i];
      }
      return nums[i];
     /*--Brute force method----*/
     /*for(int i=0;i<n;i++)
     {
        int count=0;
        for(int j=0;j<n;j++)
        {
            if(nums[i]==nums[j]) {count++;
            break;
            }
        }
        if(count!=1) return nums[i];
     }
     return 0;
     */

    }
}
