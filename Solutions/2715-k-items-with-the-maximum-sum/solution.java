class Solution {
    public int kItemsWithMaximumSum(int nO, int nZ, int nNO, int k) {
    if(nO>=k) return k*1;
    else if((nO+nZ)>=k) return nO;
    else {
        return nO-(k-(nO+nZ));
    }
    }
}
