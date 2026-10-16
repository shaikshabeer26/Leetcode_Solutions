class Solution {
    public int missingNumber(int[] nums) {
      int n=nums.length;
      int target=n;
      Arrays.sort(nums);
      for(int i=n-1;i>=0;i--){
      if(nums[i]==target) target--;
      else return target;
      }
return 0;
     
    }
}
