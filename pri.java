import java.io.*;
import java.util.*;
class pri
{
public static void main(String args[])
{
int n,i;
System.out.print("Enter the range");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
boolean flag=true;
for(i=1;i<=n;i++)
{
if(i==1 || i==2)
{
flag=true;
}
else
{
for (int j=2;j<=i/2;j++)
{
if(i%j==0)
{
flag=false;
}
else
{
flag=true;
}
}
}
System.out.print(i+"is number"+flag+"\n");
}
}
}
