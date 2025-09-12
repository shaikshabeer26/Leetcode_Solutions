void sortColors(int* nums, int numsSize) {
    int low=0,mid=0;
    int high=numsSize-1;int temp,t2;
    while(mid<=high)
    {
        if(nums[mid]==0)
        {
            temp=nums[mid];
            nums[mid]=nums[low];
            nums[low]=temp;
            low++;
            mid++;
        }
        else if(nums[mid]==1)
        {
            mid++;
        }
        else
        {
            t2=nums[mid];
         nums[mid]=nums[high];
            nums[high]=t2;
            high--;
        }
    }
}
