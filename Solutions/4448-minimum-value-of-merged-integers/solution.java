class Solution {
    public int minMergedInteger(int[] nums) {
      int n=nums.length;
      int min=Integer.parseInt(String.valueOf(nums[0])+String.valueOf(nums[1]));
      for(int i=0;i<n-1;i+=2)
      {
       String combined=String.valueOf(nums[i])+String.valueOf(nums[i+1]);
       int temp=Integer.parseInt(combined);
        if(min>temp) min=temp;
      }
        return min ;
    }
}
