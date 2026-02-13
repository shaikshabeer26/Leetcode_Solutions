/*class Solution {
    public int smallestIndex(int[] nums) {
       int l=nums.length;
        int sum=0;
        int res=-1;
        for(int i=0;i<l;i++)
            {
                sum=sum+nums[i];
                if(sum==i)
                {
                  res=i;
                break;}
                else 
                    continue;
                //return;
            }
        if(res>=0) return res;
        else return -1;
        
    }
}*/
class Solution {
    public int smallestIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum == i) return i;
        }
        return -1;
    }
}
