#include<stdio.h>
int main()
{
int n1,n2,j;
printf("Enter the min and max values of an interval: ");
scanf("%d%d",&n1,&n2);
j=n1+1;
printf("The even numbers between the intervals are: \n");
while((j>n1)&&(j<n2))
{
if(j%2==0)
printf("%d\n",j);
j++;
}
}
