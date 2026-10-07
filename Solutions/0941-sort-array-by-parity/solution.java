class Solution {
    public int[] sortArrayByParity(int[] nums) {
    int n=nums.length;
    /*-------Appraoch-1------*/
    /*if(n==1) return nums;
    int left=0,right=n-1;
    int res[]=new int[n];
    for(int temp:nums)
    if(temp%2==0) res[left++]=temp;
    else res[right--]=temp;
    return res;*/
    /*-----Approach-2-------*/
    /*int low=0,high=n-1;
while(low!=high)
{
if(nums[low]%2!=0)
{
    int temp=nums[low];
    nums[low]=nums[high];
    nums[high]=temp;
    high--;
}
else low++;
}
    return nums; */
/*---------Approach-3------*/
int idx=0;
for(int i=0;i<n;i++)
{
 if(nums[i]%2==0) 
 {
    int temp=nums[idx];
    nums[idx]=nums[i];
    nums[i]=temp;
    idx++;
 }
}
 return nums;
    }
}
