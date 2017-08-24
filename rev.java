import java.lang.*;
import java.util.*;
import java.io.*;
public class rev
{
public static void main(String s[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
StringBuffer str1=new StringBuffer();
str1.append(str);
str1=str1.reverse();
System.out.println("Reverse string is"+str1);
}
}
