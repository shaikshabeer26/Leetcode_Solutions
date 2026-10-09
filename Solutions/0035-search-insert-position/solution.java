// class Solution {
//     public int searchInsert(int[] nums, int target) {
//     //     int start=0,end=nums.length-1;
//     //    int mid=(start+end)/2;
//     //    //int mid;
//     //     while(start<end) 
//     //     {
//     //         mid=(start+end)/2;
//     //         if(nums[mid]==target) return mid;
//     //         else if(target<nums[mid]&&target>nums[mid-1]) return mid;
//     //         else if(target>nums[mid]&&target<nums[mid+1]) return mid+1;
//     //         else if(target<nums[mid]) end=mid-1;
//     //         else start=mid+1;
//     //         mid=(start+end)/2;
//     //     }
//     //     return mid;
    
//     }
// }
class Solution {
    public int searchInsert(int[] nums, int target) {
        int size = nums.length;
        for (int i = 0 ; i < size ; i++){
            if(nums[i]==target){
                return i;
            }
        }
        int q=size-1;
        while(q>=0){
            if(target==0 && nums[0]>0){
                return 0;

            }
            if(nums[q]<target){
                return q+1;
            }
            else if(nums[0]>target){
                return 0;
            }
            q--;
            
        }
        
        if (size == 1 && target>nums[0]){
            return 1;
        }
        else if (size == 1 && target<nums[0]){
            return 0;
        }
        return -1;
    }
}
