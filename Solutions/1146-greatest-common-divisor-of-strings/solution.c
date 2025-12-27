

int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}


int isDivisible(char* s, char* t) {
    int len_s = strlen(s);
    int len_t = strlen(t);

    if (len_s % len_t != 0) return 0;

    for (int i = 0; i < len_s; i++) {
        if (s[i] != t[i % len_t]) {
            return 0;
        }
    }
    return 1;
}

char* gcdOfStrings(char* str1, char* str2) {
    int len1 = strlen(str1);
    int len2 = strlen(str2);

    int gcd_len = gcd(len1, len2);

    
    static char divisor[1001];
    strncpy(divisor, str1, gcd_len);
    divisor[gcd_len] = '\0';  

    
    if (isDivisible(str1, divisor) && isDivisible(str2, divisor)) {
        return divisor;
    } else {
        return "";
    }
}
