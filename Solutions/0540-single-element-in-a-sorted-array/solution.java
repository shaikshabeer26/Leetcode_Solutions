class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        int l=0;
        int h=n-1;
        while(l<h)
        {
            int mid=(l+h)/2;
            if((mid%2==0&&nums[mid]!=nums[mid+1])||(mid%2==1&&nums[mid]!=nums[mid-1])) h=mid;
            else l=mid+1;
        }
        return nums[l];
    
    }
}
