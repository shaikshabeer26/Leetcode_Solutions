int hammingWeight(int n) {
    int x=n;
    int count=0;
    while(x!=0){
        int bit=x&1;
        x=x>>1;
        if (bit==1)
        count++;
    }
    return count;
    
}
