class Solution {
    public boolean canAliceWin(int[] nums) {
        int ssum=0,dsum=0;
        for(int temp:nums)
        {
            if(temp<10) ssum+=temp;
            else dsum+=temp;
        }
        if(dsum==ssum) return false;
        else return true;
    }
}
