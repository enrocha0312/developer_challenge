#include <stdio.h>

int main(){
	
	for(int i=1;i<=100; i++ ){
	
		if((i%5 == 0) && (i%3 == 0)){
			printf("FooBaa \n");
			continue;
		}
		if(i%3 == 0){
			printf("Foo \n");
			continue;
		}
		if(i%5 == 0){
			printf("Baa \n");
			continue;
		}
		printf("%i\n", i);
	}
	
	return 0;
}
