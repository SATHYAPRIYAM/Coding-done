import java.util.*;
import java.io.*;
class deta
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the ending natural number");
int n=sc.nextInt();
int sum=0;
for(int i=0;i<n;i++)
{
sum=sum+i;
}
System.out.println("Sum is"+sum);
}
}
