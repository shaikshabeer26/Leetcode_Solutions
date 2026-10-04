class Solution {
    public int minRotations(String s) {
     int Tr=0,p=0;
     for(int i=0;i<s.length();i++)
     {
      int F=s.charAt(i)-'0';
      int diff=Math.abs(F-p);
      int min=Math.min(diff,10-diff);
      Tr+=min;
      p=F;
     }
    return Tr;
    }
}
