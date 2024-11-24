bool hasAlternatingBits(int n) {
    int xorResult=n^(n>>1);
    int x=xorResult;
    while(x!=0){
        int bit=x&1;
        x=x>>1;
        if(bit==0)
        return false; 
    }
    return true;
}
