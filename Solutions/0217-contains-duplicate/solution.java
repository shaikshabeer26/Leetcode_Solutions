import java.util.*;
import java.lang.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
    int n=nums.length;
    Arrays.sort(nums);
    for(int i=0,j=i+1;i<n-1&&j<=n-1;i++,j++)
    {
        if(nums[i]==nums[j]) return true;
    }
    return false;

    //  for(int i=0;i<n-1;i++)
    //  {
    //     for(int j=i+1;j<n;j++)
    //     {
    //      if(nums[i]==nums[j]) return true;
    //     }
    //  }
    //  return false;
    }
}

