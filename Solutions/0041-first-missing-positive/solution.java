class Solution {
    public int firstMissingPositive(int[] nums)
    {
        Arrays.sort(nums);
        int y;
        int i=1,l=nums.length;
                for(int j=0;j<l;j++)
                 {
                    if(nums[j]==i)
                    {
                        i++;
                    }
                 }
           y=i;
        
        System.out.println(y);
        return y;
    }
}
