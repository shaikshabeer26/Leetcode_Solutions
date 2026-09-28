class Solution {
    public boolean isHappy(int n) {
        int slow=n,fast=n;
        if(n==1) return true;
        else{
        //slow=dsum(n);
        // fast=dsum(slow);
        do
        {
         slow=dsum(slow);
         fast=dsum(fast);
         fast=dsum(fast);
        }while(slow!=fast);
        if(slow==1) return true;
        else return false;
        }
    }
    public int dsum(int n){
        int sum=0;
        while(n>0)
        {
            int t=n%10;
            n=n/10;
            sum+=t*t;
        }
        return sum;
    }
}
