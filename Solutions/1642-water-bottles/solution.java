class Solution {
    public int numWaterBottles(int nB, int nE) {
     int c=nB, empty=nB,t;
       /* while(empty>=nE)
        {
            empty-=nE;
            c++;
            empty++;
        }*/
        while(empty>=nE)
        {
         t=empty/nE;
         c+=t;
         empty-=(t*nE);
         empty+=t;
        }
        return c;
        
    }
}
