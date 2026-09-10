class Solution {
    public int arraySign(int[] nums) {
        int value=0;
        for(int temp: nums)
            {
                if(temp==0){
                    return 0;
                }
                else if(temp<0) value++; else;
            }
        if(value%2==0) return 1;
        else return -1;
    }
    
}
