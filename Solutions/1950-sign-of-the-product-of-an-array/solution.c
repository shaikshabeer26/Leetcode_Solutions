int arraySign(int* nums, int numsSize) {
    int negcount=0;
    for(int i=0;i<numsSize;i++){
        if(nums[i]==0) return 0;
        else if (nums[i]<0) 
        negcount=negcount+1;
    }
    return negcount%2==0?1:-1;
}
