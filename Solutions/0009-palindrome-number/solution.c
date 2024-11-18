bool isPalindrome(int x) {
    if (x==0) return true;
    else if (x<0||x%10==0) return false;
    int original= x;
    int digit;
    long int rev=0;
    while(x!=0)
    {
        digit=x%10;
        x=x/10;
        rev=rev*10+digit;
    }
    if(original==rev) return true;
    else return false;
}
