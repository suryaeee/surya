#include <stdio.h>
int main(void) {
  	int N,count=0;
  	scanf("%d",&N);
 	while(N!=0)
    {
      N=N/10;
      count++;
    }
  	printf("Count = %d",count);
	return 0;
}
