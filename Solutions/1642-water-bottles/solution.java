class Solution {
    public int numWaterBottles(int nB, int nE) {
     int c=nB, empty=nB;
        while(empty>=nE)
        {
            empty-=nE;
            c++;
            empty++;
        }
        return c;
        
    }
}
