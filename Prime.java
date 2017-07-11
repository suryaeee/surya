import java.util.Scanner;
class Prime
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int x=s.nextInt();
int f=0;
for(int i=2;i<x;i++)
{
if(x%i==0)
{
f=1;}
}}
if(f==0)
{
System.out.println("the no is prime);
}
else
{
System.out.println("the no is not a prime);
}
}
}
