class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
       // int left=0,right=n-1;
        /*int temp[]=new int[n];
        for(int i=0;i<n;i++)
        {
            while(left<=right){
            if(nums[i]==0) 
            {
                temp[right]=0;
                right--;
            }
            else{
                temp[left]=nums[i];
                left++;
            }
            }
        }
       // return temp; */
       int i=0;
    for(int j=0;j<n;j++)
    {
        if(nums[j]!=0)
        {
            nums[i]=nums[j];
            i++;
        }
    }
    while(i<n)
    {
        nums[i]=0;
        i++;
    }

    }
}
