class Solution {
    public int numWaterBottles(int nB, int nE) {
     int c=nB, empty=nB;
       /* while(empty>=nE)
        {
            empty-=nE;
            c++;
            empty++;
        }*/
        while(empty>=nE)
        {
        int t=empty/nE;
         c+=t;
         empty-=(t*nE);
         empty+=t;
        }
        return c;
        
    }
}
