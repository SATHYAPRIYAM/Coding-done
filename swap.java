import java.util.*;
import java.io.*;
class swap
{
public static void main(String ar[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
for(int i=0;i<s.length();i+=2)
{
char c=s.charAt(i);
char r=s.charAt(i+1);
char n=c;
c=r;
r=n;
System.out.print(c+""+r);
}

}}
