class Solution {
    public int reverse(int x) {
        long rev=0,y; // we don't want to use int becuse int having low range upto only upto 2^32
        while(x!=0)
        {
           // y=x%10;
            rev=rev*10+(x%10); //rev=rev*10+y;
            x=x/10;
        }
        if(rev>Integer.MAX_VALUE||rev<Integer.MIN_VALUE)
        return 0;
        return (int)rev;
    }
}
