/**
 * Note: The returned array must be malloced, assume caller calls free().
 
int* decompressRLElist(int* nums, int numsSize, int* returnSize) 
{
    int sum=0;
    for(int i=0;i<numsSize;i=i+2)
    {
        sum=sum+nums[i];
    }
    int * arr=(int*) malloc (sum*sizeof(int));
    int x=0;
    for (int j=0;j<numsSize;j++)
    {
        int freq=nums[j];
        for(int k=0;k<freq;k++)
        {
            arr[x++]=nums[j+1];
        }
        
    }
    *returnSize=sum;
        return arr;
}*/
/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* decompressRLElist(int* nums, int numsSize, int* returnSize) 
{
    int sum = 0;
    for (int i = 0; i < numsSize; i += 2)
    {
        sum += nums[i];   // total size needed
    }

    int *arr = (int*) malloc(sum * sizeof(int));
    int x = 0;

    for (int j = 0; j < numsSize; j += 2)
    {
        int freq = nums[j];
        int val = nums[j + 1];
        for (int k = 0; k < freq; k++)
        {
            arr[x++] = val;
        }
    }

    *returnSize = sum;
    return arr;
}
