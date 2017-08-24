import java.lang.*;
import java.util.*;
import java.io.*;
public class revi
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=0,c;
System.out.println(n);
while(n!=0)
{
c=n%10;
sum=sum*10+c;
n=n/10;
}
System.out.print(sum);
}
}
