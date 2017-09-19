import java.util.*;
import java.io.*;
class day
{
public static void main(String args[])
{
System.out.println("Enter the day");
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
if(s.equals("sunday") || s.equals("SUNDAY") || s.equals("Sunday"))
{
System.out.println("Workingday('"+s+"')->false");
}
else 
{
System.out.println("Workingday('"+s+"')->true");
}
}
}
