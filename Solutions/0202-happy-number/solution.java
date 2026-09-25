import java.util.*;
import java.lang.*;
class Solution {
    public boolean isHappy(int n) {
        /*int sum=0;
        if(n%7==0) return true;
        if(n>1&&n<10) return false;
        else{
        while(sum<10)
        {
        while(n>0)
        {
         int temp=n%10;
         sum+=temp*temp;
         n=n/10;
        }
        n=sum;
        }
        }
        return (sum==1)? false:true;*/
        Set s= new HashSet();
        while(true)
        {
        int sum=0;
        while(n>0)
        {
            int ld=n%10;
            sum+=ld*ld;
            n=n/10;
        }
        if(s.add(sum)==false)
        {
        if(sum==1) return true;
        else return false;
        }
        n=sum;
        }
    }
}
