class Solution {
    public int peakValleyDifference(int[] nums) {
        int n=nums.length;
        int peakSum=0,valleysum=0;
        for(int i=1;i<n-1;i++ )
        {
        if(nums[i]>nums[i+1]&&nums[i]>nums[i-1]) peakSum+=nums[i];
        else if(nums[i]<nums[i+1]&&nums[i]<nums[i-1]) valleysum+=nums[i];
        }
        return peakSum-valleysum;
    }
}
