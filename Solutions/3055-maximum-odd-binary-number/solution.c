char* maximumOddBinaryNumber(char* s) {
    int one_count=0;
    int n=strlen(s);
    for(int i=0;s[i]!='\0';i++){
        if(s[i]=='1')
        one_count++;
    }
    int poss=0;
    for(int i=0;i<one_count-1;i++)
    s[poss++]='1';
    for(int i=0; i<n-one_count;i++)
    s[poss++]='0';
    s[poss++]='1';
    return s;
}
