int digitSquare(int n)
{
    int sum=0;
    while(n!=0)
    {
        int digit=n%10;
        n=n/10;
        sum=sum+(digit*digit);
    }
    return sum;
}
bool isHappy(int n) 
{
int c=0;
int limit=100;
while(n!=1)
{
    n=digitSquare(n);
    c++;
    if(limit==c)
    break;
}
return n==1?true:false;
}
