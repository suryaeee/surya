#include<stdio.h>
#include<conio.h>
int main()
{
int a,b,c;
scanf("%d%d%d",&a,&b,&c);
if((a>b)&&(a>c))
{
printf("a is big");
}
elseif((b>a)&&(b>c))
{
printf("b is big");
}
else
{
printf("c is big");
}
return0;
getch();
}
