class Solution {
    public long countValidSubstrings(String s) {
        int len=s.length();
        // if(len<=3){
        //     int a=0,b=0,d=0;
        //     for(int i=0;i<len;i++)
        //         {
        //             char c=s.charAt(i);
        //             if(c==a) a++;
        //             else if(c==b) b++;
        //             else  d++;
        //         }
        //     if(a>1||b>1||d>1) return len*2-1;
        //     else return len*2+1;
        // }
        // else {
        //     int a=0,b=0,d=0;
        //     for(int i=0;i<=3;i++){
        //         char c=s.charAt(i);
        //         if(c==a) a++;
        //         else if(c==b) b++;
        //         else d++;
        //     }
        //     if(a<=1||b<=1||d<=1){
        //     return len*2+1;
        //     }
        //     else {
        //     return len*2-1;
        //     }
        // }
       long temp=-1,temp2=0;
        for(int j=0;j<len;j++)
        {
            if(j>=2&&s.charAt(j-2)=='a'&&s.charAt(j-1)=='b'&&s.charAt(j)=='c')
            {
            temp=j-2;
            }
            temp2+=j-temp;
        }
        return temp2;
    }
}
