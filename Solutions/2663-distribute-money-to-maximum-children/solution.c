int distMoney(int money, int children) {
 if(money<children) return -1;
 if(money==children*8) return children;
 if (money>(children*8)) return children-1;
 money=money-children;
 int count =money/7;
 int rem=money%7;
 children=children-count ;
 if (rem==3&&children==1)
 count=count-1;
 return count;  
 }
 
