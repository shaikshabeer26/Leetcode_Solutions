class Solution {
    public int smallestIndex(int[] nums) {
        int res=-1;
        for(int i=0;i<nums.length;i++)
        {
            int sum=0,n=nums[i];
            while(n>0){
                int temp=n%10;
                n=n/10;
                sum+=temp;
            }
            if(sum==i){ res=i; break;
            }
        }
        if(res>=0) return res;
        else return -1;
    }
}
