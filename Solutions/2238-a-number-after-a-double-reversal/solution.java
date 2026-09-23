class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num==0) return true;
        if(num%10==0) return false;
        else return true;
        //return (num%10==0)? false: true;
    }
}
