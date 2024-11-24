int averageValue(int* nums, int numsSize) {
    int sum=0,count=0;
    for(int i=0;i<numsSize;i++){
        int x=nums[i];
        if(x%2==0&&x%3==0){
            sum=sum+x;
            count++;
        }
    }if(count==0) return 0;
    return sum/count;
}
