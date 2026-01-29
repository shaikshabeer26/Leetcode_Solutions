class Solution {
    public int[] twoSum(int[] nums, int target) {
       int l=nums.length; int twoSum[]=new int[2];
        int sum=0;
        for(int i=0;i<l-1;i++)
            {
                for(int j=i+1;j<l;j++)
                    {
                        sum=nums[i]+nums[j];
                        if(target==sum)
                        {
                           twoSum[0]=i;
                            twoSum[1]=j;
                            break;
                        }
                    }
            } 
        return twoSum;
    }
}
