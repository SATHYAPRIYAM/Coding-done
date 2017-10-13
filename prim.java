import java.io.*;
import java.util.*;
class prim
{
public static void main(String args[])
{
int n,i;
System.out.print("Enter the range");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
boolean flag=true;
if(n==1 || n==2)
{
flag=true;
}
else
{
for (int j=2;j<=n/2;j++)
{
if(n%j==0)
{
flag=false;
}
else
{
flag=true;
}
}
}
System.out.print(n+"is number"+flag+"\n");
}
}

