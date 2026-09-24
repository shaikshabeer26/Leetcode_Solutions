class Solution {
    public int arrangeCoins(int n) {
    n-=1;
     int req=2,i=1;  
    while(n>=req)
     {
      i++;
      n-=req;
      req++;
     }
     return req-1;
    }
}
