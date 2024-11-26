int alternateDigitSum(int n) {
    int x=n;
    int rev=0;
    while(x!=0)
    {int dig=x%10;
     x=x/10;
     rev=rev*10+dig;
     }
     int sign=1;
     x=rev;
     int sum=0;
     while(x!=0)
     {
        int dig=x%10;
        x=x/10;
        sum=sum+sign*dig;
        sign=sign*(-1);
     }
     return sum;
}
