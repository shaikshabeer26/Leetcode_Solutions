class Solution {
    public int numWaterBottles(int nB, int nE) {
     int empty=nB,t;
       /* while(empty>=nE)
        {
            empty-=nE;
            c++;
            empty++;
        }*/
        while(empty>=nE)
        {
         t=empty/nE;
         nB+=t;
         empty-=(t*nE);
         empty+=t;
        }
        return nB;
        
    }
}
