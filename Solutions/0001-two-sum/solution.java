class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int temp[]=new int[2];
        for(int i=0;i<n-1;i++)
        {
            int t=0;
            for(int j=i+1;j<n;j++)
            {
                if((nums[i]+nums[j])==target)
                {
                    temp[0]=i;
                temp[1]=j;
                //return temp;//
                t++;
                break;
                }

            }
            if(t!=0) break;
        }
      return temp;
}}        // return temp;

