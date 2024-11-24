int sumOfDigit(int x) {
    int sum=0;
    while(x!=0){
        int dig=x%10;
        x=x/10;
        sum=sum+dig;
    }
    return sum;
}
int differenceOfSum(int* nums, int numsSize){
    int elementSum=0;
    int digitSum=0;
    for(int i=0;i<numsSize;i++)
    {
        int element=nums[i];
        elementSum=elementSum+element;
        digitSum=digitSum+sumOfDigit(element);
    }
    return elementSum-digitSum;
}
