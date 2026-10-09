class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int temp=0,a=x;
        while(x>0)
        {
            int last=x%10;
            temp=temp*10 +last;
            x/=10;
        }
        if(temp==a) return true;
        else return false;
    }
}
