char* largestOddNumber(char* num) {
    int n=strlen(num);
    for (int i=n-1;i>=0;i--)
    {
        int digit =num[i]-'0';
        if(digit%2!=0){
            num[i+1]='\0';
            return num;
        }
    }
    return "";
}
