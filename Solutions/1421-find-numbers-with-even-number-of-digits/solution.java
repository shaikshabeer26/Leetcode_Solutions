class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int temp:nums)
        {
            if(temp<100&&temp>9) count++;
            else if(temp>999&&temp<=9999) count++;
            else if(temp>=100000&&temp<=999999) count++;
           // else if(temp>999999&&temp<=9999999) count++;
            else ;
             
        }
        return count;
    }
}
