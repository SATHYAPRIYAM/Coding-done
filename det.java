import java.util.*;
import java.io.*;
class det
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.print("Numbers are"+n+"\n");
int[] a=new int[n];
for(int i=0;i<n;i++)
{
System.out.print("Enter the"+i+" number");
a[i]=sc.nextInt();
}
int sum=0;
for(int i=0;i<n;i++)
{
sum=sum+a[i];
}
System.out.println("Sum is"+sum);
}
}
