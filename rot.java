import java.util.*;
import java.io.*;
class rot
{
public static void main(String args[])
{
System.out.print("Enter the array size");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
System.out.print("Enter the rotate size");
int k=sc.nextInt();
System.out.print("Enter the array element");
for(int i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
for(int i=a.length-k;i<a.length;i++)
{
System.out.print(a[i]);
}
for(int i=0;i<a.length-k;i++)
{
System.out.print(a[i]);
}
}
}
