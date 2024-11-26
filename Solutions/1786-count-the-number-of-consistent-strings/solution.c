

int countConsistentStrings(char * allowed, char ** words, int wordsSize){
{bool allowedset[26]={false};
for(int i=0;i<strlen(allowed);i++){
    int ascii=allowed[i]-'a';
    allowedset[ascii]=true;}
    int count=0;
    for(int i=0;i<wordsSize;i++){
        char* word=words[i];
        bool isconsistant=true;
        for(int j=0;j<strlen(word);j++){
            char letter=word[j];
            int ascii=letter-'a';
            if(!allowedset[ascii]){
                isconsistant=false;
                break;
            }
        }
        if(isconsistant)
        count++;
    }
    return count;
}
}

