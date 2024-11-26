char kthCharacter(int k) {
    int count = 0;
    int n;
	
    while (k != 1){
        n = 1;
        while (k > n){
            n *= 2;
        }
        count = count + 1;
        k = k - (n/2);
    }
    return ('a'+count);
}

