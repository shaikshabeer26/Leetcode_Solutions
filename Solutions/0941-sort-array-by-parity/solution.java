class Solution {
    public int[] sortArrayByParity(int[] nums) {
    int n=nums.length;
    if(n==1) return nums;
    int left=0,right=n-1;
    int res[]=new int[n];
    for(int temp:nums)
    if(temp%2==0) res[left++]=temp;
    else res[right--]=temp;

    return res;
    }
}
