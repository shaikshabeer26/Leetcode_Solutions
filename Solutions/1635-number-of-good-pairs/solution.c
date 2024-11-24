int numIdenticalPairs(int* nums, int numsSize) {
 int freq[100+1]={0};
 int count=0;
 for(int i=0;i<numsSize;i++){
    int ele=nums[i];
    if(freq[ele]!=0){
        count=count+freq[ele];
        freq[ele]++;
    }
    else freq[ele]++;
 }
 return count;
}
