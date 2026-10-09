class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int y=x,temp=0,last;
        while(x!=0)
        {
            last=x%10;
            temp=temp*10+last;
            x/=10;

        }
        if(y==temp) return true;
        else return false;
    }
}
