import java.util.*;
import java.io.*;
class camel
{
public static void main(String ar[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();  
char currentstring,previousstring;
String result="";
char firstchar=s.charAt(0);
result=result+Character.toUpperCase(firstchar);
for(int i=1;i<s.length();i++)
{
currentstring=s.charAt(i);
previousstring=s.charAt(i-1);
if(previousstring==' ')
{
result=result+Character.toUpperCase(currentstring);
}
else
{
result=result+currentstring;
}
}
System.out.println(result);
}
}
