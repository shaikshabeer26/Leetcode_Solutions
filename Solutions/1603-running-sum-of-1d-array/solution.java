class Solution {
    public int[] runningSum(int[] nums) {
    int n=nums.length;
    int[] temp=new int[n]; 
    int sum=0;
    for(int j=0;j<n;j++)
    {
    sum+=nums[j];
    temp[j]=sum;
    }
   // System.out.print(temp[]+" ");
        return temp;
    // int sum(int i,int j,int arr[])
    // {
    //   int sum=0;
    //   for(int m=i;m<=j;m++)
    //   {
    //     sum+=arr[m];
    //   }
    
    }
}
