class Solution {
    public int findsetbit(int x){
        int count=0;
        int t1=x;
        if(t1==0) return 0;
        while(t1!=0)
        {
         int temp=t1%2;
         if(temp==1) count++;
         t1=t1/2;
        }
        return count;
       // return Integer.bitCount(x);
    }
    public int calculateScore(int a, int b) {
        int s1=findsetbit(a);
        int s2=findsetbit(b);
        if(s1>=s2) return s1*s2;
        else return s2/s1;
    }
}
