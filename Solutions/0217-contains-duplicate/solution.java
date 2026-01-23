class Solution {
    public boolean containsDuplicate(int[] nums) {
      int l=nums.length; // int l=Sizeof( nums[]);
      /***  for(int i=0;i<l-1;i++)
        {
            for (int j=i+1;j<l;j++)
            {
                if(nums[i]==nums[j])
                return true;
            }
         //if(i==l-2)
         //return false;
        }
        return false;***/
        Arrays.sort(nums);
        for(int i=0;i<l-1;i++)
        {
            if(nums[i]==nums[i+1])
            return true;
        }
     return false;
    }
}

