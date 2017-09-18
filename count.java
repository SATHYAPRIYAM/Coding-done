import java.io.*;
import java.util.*;
class count
{
public static void main(String args[])
{
int num,i,rev=0;
System.out.println("Enter the number");
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
while(num!=0)
{
i=num%10;
rev=rev+1;
num=num/10;
}
System.out.println("The count is "+rev);
}
}


