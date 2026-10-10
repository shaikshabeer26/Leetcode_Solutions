class Solution {
    public int[] maxProductPair(int[] nums, int target) {
      int n=nums.length;
      int max=Integer.MIN_VALUE;
     //int[] maxidx=new int[2];
     int []maxidx={-1,-1};
    // Arrays.sort(nums);
    for(int i=n-1;i>0;i--)
    {
     for(int j=i-1;j>=0;j--) 
     {
      if(nums[i]+nums[j]==target)
      {
        if(nums[i]!=nums[j])
        {
         int temp=nums[i]*nums[j];
         if(temp>max)
         {
            max=temp;
             if(nums[i]>nums[j]){
            maxidx[0]=i;
            maxidx[1]=j;
             }
             else{
                 maxidx[0]=j;
                 maxidx[1]=i;
             }
         }
        }}
     }}
    //if(maxidx.isEmpty())
   // if(nums[maxidx[0]]==nums[maxidx[1]]){maxidx[0]=-1;
   //                                       maxidx[1]=-1;
   //                                      return maxidx;}
    return maxidx;
 }}
