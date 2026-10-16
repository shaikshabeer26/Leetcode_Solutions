class Solution {
    public int missingNumber(int[] nums) {
     /* int n=nums.length;    //Complexity: O(N log N)
      int target=n;
      Arrays.sort(nums);
      for(int i=n-1;i>=0;i--){
      if(nums[i]==target) target--;
      else return target;
      }
    return 0;
    */

    /*-- O(N) ----*/
    int n=nums.length;
    int total=n*(n+1)/2;
    int sum=0;
    for(int i=0;i<n;i++){
        sum+=nums[i];
    }
     return total-sum;
    }
}
