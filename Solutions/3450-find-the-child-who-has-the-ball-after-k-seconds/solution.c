int numberOfChild(int n, int k) {
    int div=k/(n-1);
    int rem=k%(n-1);
    return (div%2==0)? rem:n-rem-1;
    
}
