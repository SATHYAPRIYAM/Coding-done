import java.io.*;
import java.util.*;
class prime
{
public static void main(String a[])
{
System.out.println("Enter the number");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
boolean ip=true;
if(n==1)
{
ip=true;
}
for(int j=2;j<=n/2;j++)
{
if(n%j==0)
{
ip=false;
break;
}
}
if(ip)
{
System.out.print(n+"is prime");
}
else
{
System.out.print(n+"is not prime");
}
}}


