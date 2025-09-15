int max(int a,int b)
{
    return a>b?a:b;
}
int maxSubArray(int* nums, int numsSize) {
    int maxSum=INT_MIN;
    int currSum=0;
    for (int i=0;i<numsSize;i++)
    {
        currSum=currSum+nums[i];
        maxSum=max(currSum,maxSum);
        if(currSum<0) currSum=0;
    }
    return maxSum;
}
