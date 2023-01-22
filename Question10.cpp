#include <stdio.h>

int wordLength (char word[]){
	int i = 0;
	if(word[0] == '\0'){
		printf("Empty String");
	}
	while(word[i]!='\0'){
		++i;
	}
	return i;
}

int main(){
	char word[100];
	char character;
	int i = 0;
	printf("Type your word\n");
	
	do{
		character = getchar();
		word[i] = character;
		++i;
	}while(character != '\n');
	
	int count = i-1;
	word[i-1] = '\0';
	printf("Your word is: %s\n. Its length is %i", word,count);
	int length = wordLength(word);
	printf("\n Calculating length with a function:  %i", length);
}
