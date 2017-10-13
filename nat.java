import java.io.*;
import java.util.*;
class nat
{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Ending natural number");
int n=sc.nextInt();
int sum=0;
for(int i=0;i<=n;i++)
{
sum=sum+i;
}
System.out.print("The sum is"+sum);
}}
