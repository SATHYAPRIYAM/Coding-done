import java.io.*;
import java.util.*;
class palin
{
public static void main(String a[])
{
System.out.println("Enter the number");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int s=0,c,i;
i=n;
while(n!=0)
{
c=n%10;
s=s*10+c;
n=n/10;
}
if(s==i)
{
System.out.print("The given number palindrome"+s);
}
else
{
System.out.print("The given number is not a palindrome"+s);
}
}
}



