int hammingDistance(int x, int y) {
    int xor=x^y;
    int n = xor;
    int count=0;
    while(n!=0){
        int bit=n&1;
        n=n>>1;
        if(bit==1)count++;
    }
    return count;
}
