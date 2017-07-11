#include <stdio.h>
int main(void) {
	int n1,n2;
	int i,flag=0,j;
	scanf("%d %d",&n1,&n2);
	for(j=n1;j<n2;j++)
	{
	for(i=2;i<=j/2;i++)
	{
		if(j%i==0)
		{
			 flag=1;
			 break;
		}
	}
	if(flag!=1)
	   	printf("%d\t",j);
	   	flag=0;
	   	
	}
		return 0;
}
