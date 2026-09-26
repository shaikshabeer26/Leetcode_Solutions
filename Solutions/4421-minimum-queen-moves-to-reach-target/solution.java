class Solution {
    public int minQueenMoves(int[] S, int[] T) {
    int temp=0;
    if(S[0]==T[0]&&S[1]==T[1]) return 0;
    else if((S[0]==T[0]||S[1]==T[1])||Math.abs(S[0]-T[0])==Math.abs(S[1]-T[1])) return 1;
    //else if((S[1]==T[0]&&S[0]==T[1])||S[0]==T[0]||S[1]==T[1]) return 1;
    //else if(
   // {
    // int t1=S[0],t2=S[1];
   /*  else if(T[0]==(S[0]+1)&&T[1]==(S[1]+1)) return 1;
     else if(T[0]==(S[0]+1)&&T[1]==(S[1]-1)) return 1;
     else if(T[0]==(S[0]-1)&&T[1]==(S[1]+1)) return 1;
     else if(T[0]==(S[0]-1)&&T[1]==(S[1]-1)) return 1;
     else if{
        
     }*/
    else return 2;
    }
}
