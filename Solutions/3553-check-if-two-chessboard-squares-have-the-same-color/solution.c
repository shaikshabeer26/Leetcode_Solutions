bool checkTwoChessboards(char* coordinate1, char* coordinate2) {
    int r1=coordinate1[0]-'a'+1;
    int c1=coordinate1[1]-'1'+1;
    int r2=coordinate2[0]-'a'+1;
    int c2=coordinate2[1]-'1'+1;
    int color1=(r1+c1)%2==0;
    int color2=(r2+c2)%2==0;
    return color1==color2;
}
