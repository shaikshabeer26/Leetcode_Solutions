class Solution {
    public int addDigits(int num) {
    int temp=(num==0?0:num%9==0?9:num%9);
    return temp;
    // if(num==0) return 0;
    // else if(num%9==0) return 9;
    // else return num%9;
 }
    // int sum=0;
    // while(num>0)
    // {
    // int n=num%10;
    // sum+=n;
    // num=num/10;
    // }
    // int add=0;
    // while(sum>0)
    // {
    // int n=num%10;
    // add+=n;
    // num=num/10;
    // }
//   else{
//     int sum=0;
//     do{
//      sum=Sum(num);
//     }while(sum>10);
//     return sum;
//   }
//  }
//  public int Sum(int num)
//  {
//     int sum=0;
//     while(num>0)
//     {
//     int n=num%10;
//     sum+=n;
//     num=num/10;
//     }
//     return sum;

}
