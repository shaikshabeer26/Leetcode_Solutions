int distanceTraveled(int mainTank, int additionalTank) 
{
    int milage=10;
    int consumption=0;
    int traveldistance=0;
    while(mainTank!=0)
    {
        consumption=mainTank>=5? 5:mainTank;
        mainTank=mainTank-consumption;
        int currentDistance=consumption*milage;
        traveldistance=traveldistance+currentDistance;
        if(additionalTank>0&&consumption==5){
         additionalTank--;
         mainTank++;
        }
    }
    return traveldistance;
}    

