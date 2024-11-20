int sumOfTheDigitsOfHarshadNumber(int x) {
    int original=x;
    int sum=0;
    while(x!=0){
    int digit=x%10;
    x=x/10;
    sum=sum+digit;
    }
    return original%sum==0? sum:-1;
}
