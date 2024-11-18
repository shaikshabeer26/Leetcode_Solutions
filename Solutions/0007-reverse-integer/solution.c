int reverse(int x){
  int digit;
  long int  rev=0;
  while (x!=0)
  {digit=x%10;
  x=x/10;
  rev=rev*10+digit;
  }
  if (rev>INT_MAX||rev<INT_MIN)
  return 0;
  else 
  return rev;
}
