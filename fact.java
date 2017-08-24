import java.lang.*;
import java.util.*;
import java.io.*;
public class fact
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int k=1;
for(int c=1;c<=n;c++)
{
k=k*n;
n--;
}
System.out.println(k);
}
}
