/*class Solution {
    public int minOperations(int[] nums, int x) {
       int len=nums.length;
       if(x<nums[0] && x<nums[len-1]) return -1;
       else if(nums[0]==x||nums[len-1]==x) return 1;
       else if(x>nums[0]&&x>nums[len-1]) 
       {
        int step=0,i=1;
        while(x>0){
        if(nums[len-i]<=x){
        x-=nums[len-i];
        step++;
        }
        i++;
        }
        return step;
       }
       else return -1;
       }

    }
}
    */
class Solution {
    public int minOperations(int[] nums, int x) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        int target = totalSum - x; 
        if (target == 0) return nums.length;
        // If target is negative, it's impossible to reduce x to 0
        if (target < 0) return -1; 
        int maxLength = -1;
        int currentSum = 0;
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            currentSum += nums[right];
            while (currentSum > target && left <= right) {
                currentSum -= nums[left];
                left++;
            }
            if (currentSum == target) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
        }
        // Minimum operations = Total elements - Maximum middle elements
        return maxLength == -1 ? -1 : nums.length - maxLength;
    }
}

