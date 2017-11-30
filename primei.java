import java.util.*;
class primei
{
public static void main(String str[])
{
Scanner sc=new Scanner(System.in);
int m=sc.nextInt();
int n=sc.nextInt();
boolean prime=true;
for(int i=m;i<n;i++)
{
for(int j=2;j<=i-1;j++)
{
if(i%j==0)
{
prime=false;
break;
}
else
{
prime=true;
}}
if(prime)
{
System.out.println(i);
}
}
}
}
