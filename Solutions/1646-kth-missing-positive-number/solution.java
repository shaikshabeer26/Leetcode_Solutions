class Solution {
    public int findKthPositive(int[] nums, int k) {
    /*int n=nums.length; 
    int j=0;
    int []temp=new int[nums[n-1]];
   // if(k>=nums[n-1]) return nums[n-1]+k;
    for(int i=1;i<Math.max(n,k);i++)
    {
        if(nums[i]!=i) temp[j++]=i;
        else i--;
        if(k==j) return temp[j];
    }
 return 0;
 */
 for(int i=0;i<nums.length;i++)
 {
    if(nums[i]<=k) k++;
    else break;
 }
 return k;
    }
}
