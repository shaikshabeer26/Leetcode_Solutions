class Solution {
    public boolean checkPerfectNumber(int num) {
        int temp=0,i=1;
        //for(int i=1;i<num;i++)
        while(i<num){
            if(num%i==0) 
            {
                temp=temp+i;
            }
            i++;
        }
        // if(temp==num) return true;
        // else return false;
         return (temp==num)?  true : false;
    }
}
