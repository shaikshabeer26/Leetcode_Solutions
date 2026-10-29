class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long temp=0,t2=0;
        for(int num:nums){
            if(num <= maxK &&num>=minK){
                t2++;
                temp+=t2;
            }
          else t2=0;
        }
        return temp;
    }
}
